package deneme;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

//3.interface

//inner class && Statik method tanımlama
public class Malzeme {
     public  static class baglanti{
    static  Connection con=null;
       static Statement statement=null;
     static PreparedStatement preparedStatement=null;
    
}
    private int malzeme_id;
    private String malzeme_ad;
      private String malzeme_kategori;  
     private String malzeme_adet;  

    public Malzeme( int malzeme_id,String malzeme_ad, String malzeme_kategori, String malzeme_adet) {
           this.malzeme_id = malzeme_id;
        this.malzeme_ad = malzeme_ad;
        this.malzeme_kategori = malzeme_kategori;
        this.malzeme_adet = malzeme_adet;
    }
    
//Private değişkenlere erişim 
    public String getMalzeme_ad() {
        return malzeme_ad;
    }

    public void setMalzeme_ad(String malzeme_ad) {
        this.malzeme_ad = malzeme_ad;
    }

    public int getMalzeme_id() {
        return malzeme_id;
    }

    public void setMalzeme_id(int malzeme_id) {
        this.malzeme_id = malzeme_id;
    }

    public String getMalzeme_kategori() {
        return malzeme_kategori;
    }

    public void setMalzeme_kategori(String malzeme_kategori) {
        this.malzeme_kategori = malzeme_kategori;
    }

    public String getMalzeme_adet() {
        return malzeme_adet;
    }

    public void setMalzeme_adet(String malzeme_adet) {
        this.malzeme_adet = malzeme_adet;
    }
     
     
     
     
}
