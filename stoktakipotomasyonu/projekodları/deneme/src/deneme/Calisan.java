package deneme;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

//3.interface
public class Calisan {
    private int id;
    private String ad;
    private String soyad;  
     private String departman;   
     

    public Calisan(int id, String ad, String soyad, String departman) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.departman = departman;
    }

    //Private değişkenlere erişim 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
   //inner class && Statik method tanımlama   
  public  static class baglanti{
      Connection con=null;
       Statement statement=null;
     PreparedStatement preparedStatement=null;
    
}
     
}
