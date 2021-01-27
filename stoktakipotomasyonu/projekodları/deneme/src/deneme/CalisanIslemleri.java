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


public class CalisanIslemleri implements ICalisan, IDatabase{
 Calisan.baglanti baglanti=new Calisan.baglanti();
     
    //Private değişken erişim örneklemesi
    public ArrayList<Calisan> calisanlariGetir(){
        ArrayList<Calisan> cikti=new ArrayList<Calisan>();
        try {
            baglanti.statement=(Statement)  baglanti.con.createStatement();
              String sorgu="Select * From personel ";
              
              ResultSet rs= baglanti.statement.executeQuery(sorgu);
              while (rs.next()) {                
                int id=rs.getInt("personel_id");
                String ad=rs.getString("personel_ad");
                String soyad=rs.getString("personel_soyad");
                String departman=rs.getString("personel_dept");
               cikti.add(new Calisan(id,ad,soyad,departman));
                
                       
            }
              return cikti;
              
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      
    }
       
    
     public boolean girisYap(String kullanici_adi,String parola){
         try {
             java.sql.PreparedStatement  uygula = baglanti.con.prepareStatement("Select *from adminler where admin_ad = ? and admin_sifre = ?");
          
             
             uygula.setString(1, kullanici_adi);
              uygula.setString(2, parola);
              
              ResultSet rs= uygula.executeQuery();
              
              return rs.next();
              
         } catch (SQLException ex) {
             Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
                return false;
         }
      
     }
     //kullanılan değişkenlere ilk değer ataması
    public CalisanIslemleri() {
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
             baglanti.con=DriverManager.getConnection(url, kullanici_adi,parola);
              System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız");
        }
    }

    @Override
    public void calisanSil(int id) {
   String sorgu = "Delete from personel where personel_id = ?";
        
        try {
             baglanti.preparedStatement =  baglanti.con.prepareStatement(sorgu);
             baglanti.preparedStatement.setInt(1, id);
            
             baglanti.preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void calisanGuncelle(int id, String yeni_ad, String yeni_soyad, String yeni_departman) {
String sorgu =  "Update personel set personel_ad = ? , personel_soyad = ? , personel_dept = ? where personel_id = ?";
        
        try {
             baglanti.preparedStatement =  baglanti.con.prepareStatement(sorgu);
            
            
             baglanti.preparedStatement.setString(1,yeni_ad);
             baglanti.preparedStatement.setString(2,yeni_soyad);
            
             baglanti.preparedStatement.setString(3,yeni_departman);
        
            
             baglanti.preparedStatement.setInt(4, id);
            
             baglanti.preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void calisanEkle(String ad, String soyad, String departman) {
        
        String sorgu = "Insert Into personel (personel_ad,personel_soyad,personel_dept) VALUES(?,?,?)";
        
        try {
             baglanti.preparedStatement = (PreparedStatement)  baglanti.con.prepareStatement(sorgu);
            
            
             baglanti.preparedStatement.setString(1, ad);
             baglanti.preparedStatement.setString(2, soyad);
             baglanti.preparedStatement.setString(3, departman);
       
             baglanti.preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

   
  
   
}