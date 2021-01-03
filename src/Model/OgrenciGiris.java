
package Model;

public class OgrenciGiris extends YoneticiGiris{
    
    private String ogrenciNo;

    public OgrenciGiris(String ogrenciNo, int id, String kullaniciAd, String kullaniciSifre) {
        this.ogrenciNo = ogrenciNo;
    }
    public OgrenciGiris() {
        
    }
    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public void YoneticiGiris(int id, String kullaniciAd, String kullaniciSifre) {
       
    }
    
}
