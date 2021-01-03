/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Notlar {
    private int idNot;
    private String ogrenciNo;
    private String dersAdi;
    private int not1;
    private int not2;
    private int odev;
    private double ortalama;    

    public Notlar(int idNot, String ogrenciNo, String dersAdi, int not1, int not2, int odev, double ortalama) {
        this.idNot = idNot;
        this.ogrenciNo = ogrenciNo;
        this.dersAdi = dersAdi;
        this.not1 = not1;
        this.not2 = not2;
        this.odev = odev;
        this.ortalama = ortalama;
    }

    public Notlar() {
    }

    public int getIdNot() {
        return idNot;
    }

    public void setIdNot(int idNot) {
        this.idNot = idNot;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public int getNot1() {
        return not1;
    }

    public void setNot1(int not1) {
        this.not1 = not1;
    }

    public int getNot2() {
        return not2;
    }

    public void setNot2(int not2) {
        this.not2 = not2;
    }

    public int getOdev() {
        return odev;
    }

    public void setOdev(int odev) {
        this.odev = odev;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }
    
    
}
