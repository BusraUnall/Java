
package Model;


public class Duyuru {
    private int idDuyuru;
    private String kime;
    private String kimden;
    private String mesaj;

    public Duyuru(int idDuyuru, String kime, String kimden, String mesaj) {
        this.idDuyuru = idDuyuru;
        this.kime = kime;
        this.kimden = kimden;
        this.mesaj = mesaj;
    }
    
    public Duyuru() {
     
    }

    public int getIdDuyuru() {
        return idDuyuru;
    }

    public void setIdDuyuru(int idDuyuru) {
        this.idDuyuru = idDuyuru;
    }

    public String getKime() {
        return kime;
    }

    public void setKime(String kime) {
        this.kime = kime;
    }

    public String getKimden() {
        return kimden;
    }

    public void setKimden(String kimden) {
        this.kimden = kimden;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
    
}
