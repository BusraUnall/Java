
package Model;


public abstract class YoneticiGiris {
    private int id;
    private String kullaniciAd;
    private String kullaniciSifre;
    
    public abstract void YoneticiGiris(int id, String kullaniciAd,String kullaniciSifre);
    
    public YoneticiGiris() {
       
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

}