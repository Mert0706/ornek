package com.bilgeadam.ornek;

public class Kisi {

    public int no;
    public String ad;
    public String soyad;
    public double maas;

    public Kisi() {
    }

    public Kisi(int no, String ad, String soyad, double maas) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    /*Get Set Baslangıç*/
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    /*Get Set Bitiş*/


    public double yillik_maas_getir(){
        double yillik_maas = this.maas * 12;

        return yillik_maas;

    }

    public String adSoyadGetir(){
        return this.ad+" "+this.soyad;

    }

    @Override
    public String toString() {
        return "Kisi{" +
                "no=" + no + "\n" +
                ", ad=" + ad + "\n" +
                ", soyad=" + soyad + "\n" +
                ", maas=" + maas + "\n" +
                ", Yıllık Maaş=" + yillik_maas_getir() +
                '}';
    }
}
