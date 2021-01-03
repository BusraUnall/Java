
package Model;

public class Ogretmenler {
    private int idOgretmen;
    private String ogretmenAd;
    private String ogretmenSoyad;
    private String ogretmenBrans;

    public Ogretmenler(int idOgretmen, String ogretmenAd, String ogretmenSoyad, String ogretmenBrans) {
        this.idOgretmen = idOgretmen;
        this.ogretmenAd = ogretmenAd;
        this.ogretmenSoyad = ogretmenSoyad;
        this.ogretmenBrans = ogretmenBrans;
    }

    public int getIdOgretmen() {
        return idOgretmen;
    }

    public void setIdOgretmen(int idOgretmen) {
        this.idOgretmen = idOgretmen;
    }

    public String getOgretmenAd() {
        return ogretmenAd;
    }

    public void setOgretmenAd(String ogretmenAd) {
        this.ogretmenAd = ogretmenAd;
    }

    public String getOgretmenSoyad() {
        return ogretmenSoyad;
    }

    public void setOgretmenSoyad(String ogretmenSoyad) {
        this.ogretmenSoyad = ogretmenSoyad;
    }

    public String getOgretmenBrans() {
        return ogretmenBrans;
    }

    public void setOgretmenBrans(String ogretmenBrans) {
        this.ogretmenBrans = ogretmenBrans;
    }
    
}
