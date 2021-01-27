
package deneme;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class MalzemeIslemleri implements IMalzeme,IDatabase{
   Calisan.baglanti baglanti=new Calisan.baglanti();
    
      public ArrayList<Malzeme> malzemeGetir(){
    ArrayList<Malzeme> cikti=new ArrayList<Malzeme>();
        try {
            baglanti.statement=(Statement) baglanti.con.createStatement();
              String sorgu="Select * From malzeme ";
              
              ResultSet rs=baglanti.statement.executeQuery(sorgu);
              while (rs.next()) {                
                int malzeme_id=rs.getInt("malzeme_id");
                String malzeme_ad=rs.getString("malzeme_ad");
                String malzeme_kategori=rs.getString("malzeme_kategori");
                String  malzeme_adet=rs.getString("malzeme_adet");
              
               cikti.add(new Malzeme(malzeme_id,malzeme_ad,malzeme_kategori,malzeme_adet));
                
                       
            }
              return cikti;
              
        } catch (SQLException ex) {
            Logger.getLogger(MalzemeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      } 
      //kullanılan değişkenlere ilk değer ataması
        public MalzemeIslemleri() {
        Database("root","","demo","localhost",3306);
    }

   

    @Override
    public void Database(String kullanici_adi, String parola, String db_ismi, String host, int port) {
       String url="jdbc:mysql://"+host+":"+port+"/"+db_ismi+"?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
        } 
        try {
            baglanti.con=DriverManager.getConnection(url,kullanici_adi,parola);
              System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız");
        }
    }

    @Override
    public void malzemeSil(int malzeme_id) {
         String sorgu = "Delete from malzeme where malzeme_id = ?";
        
        try {
            baglanti.preparedStatement = baglanti.con.prepareStatement(sorgu);
            baglanti.preparedStatement.setInt(1, malzeme_id);
            
            baglanti.preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(MalzemeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void malzemeGuncelle(int malzeme_id, String yeni_malzeme_ad, String yeni_malzeme_kategori, String yeni_malzeme_adet) {
String sorgu =  "Update malzeme set malzeme_ad = ? , malzeme_kategori = ? , malzeme_adet = ? where malzeme_id = ?";
        
        try {
            baglanti.preparedStatement = baglanti.con.prepareStatement(sorgu);
            
            
            baglanti.preparedStatement.setString(1,yeni_malzeme_ad);
            baglanti.preparedStatement.setString(2,yeni_malzeme_kategori);
            
            baglanti.preparedStatement.setString(3,yeni_malzeme_adet);

            
            baglanti.preparedStatement.setInt(4, malzeme_id);
            
           baglanti.preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MalzemeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void malzemeEkle(String malzeme_ad, String malzeme_kategori, String malzeme_adet) {
String sorgu = "Insert Into malzeme (malzeme_ad,malzeme_kategori,malzeme_adet) VALUES(?,?,?)";
        
        try {
            baglanti.preparedStatement = (PreparedStatement) baglanti.con.prepareStatement(sorgu);
            
            
            baglanti.preparedStatement.setString(1, malzeme_ad);
            baglanti.preparedStatement.setString(2, malzeme_kategori);
            baglanti.preparedStatement.setString(3, malzeme_adet);
       
            baglanti.preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MalzemeIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
        
        
        
}
