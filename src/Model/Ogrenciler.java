
package Model;

public class Ogrenciler {
   private int idOgrenci;
   private int ogrenciNo;
   private String ogrenciAd;
   private String ogrenciSoyad;
   private int ogrenciSinif;

   
    public Ogrenciler(int idOgrenci, int ogrenciNo, String ogrenciAd, String ogrenciSoyad, int ogrenciSinif) {
        this.idOgrenci = idOgrenci;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciSinif = ogrenciSinif;
    }
        public Ogrenciler() {

    }

    public int getIdOgrenci() {
        return idOgrenci;
    }

    public void setIdOgrenci(int idOgrenci) {
        this.idOgrenci = idOgrenci;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }

    public int getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(int ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }
    
    

   
}
