package com.mahmutbas.rrm;

public class Kisi {
    private String  isim;
    private int cinsiyet;
 
    public Kisi(String isim, int cinsiyet) {
        super();
        this.isim = isim;
        this.cinsiyet = cinsiyet;
    }
 
    @Override
    public String toString() {
        return isim;
    }
 
    public String getIsim() {
        return isim;
    }
 
    public void setIsim(String isim) {
        this.isim = isim;
    }
 
    public int cinsiyeti() {
        return cinsiyet;
    }
 
    public void setKadinMi(int cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}