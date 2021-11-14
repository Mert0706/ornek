package com.bilgeadam.ornek;

public class HesapMakinesi {

    public int topla(int sayi1, int sayi2) {

        System.out.println("int topla çalıştı");
        return sayi1+sayi2;

    }

    public double topla(double sayi1, double sayi2) {

        System.out.println("double topla çalıştı");
        return sayi1+sayi2;

    }

    public int carpma(int sayi1, int sayi2){

        return sayi1*sayi2;
    }

    public double bolum(int sayi1, int sayi2){

        return  sayi1/(double)sayi2;
    }

    public int cikar (int sayi1, int sayi2){

        return  sayi1-sayi2;
    }

    public static void main(String[] args) {
        HesapMakinesi hm = new HesapMakinesi();

        System.out.println(hm.topla(5,7));
        System.out.println(hm.cikar(5,7));
        System.out.println(hm.bolum(12,2));
        System.out.println(hm.carpma(5,5));

        int sonuc = hm.topla(9,14);
        System.out.println("Sonuç:" +sonuc);

        System.out.println("------------------");
        System.out.println(hm.topla(7.1, 5.6));


    }
}
