package com.bilgeadam.ornek;

public class VeriTipleri {

    public static void main(String[] args) {

        //Küçük harf ile baslayan değişkenler primitive diye geçer
        int yas = 20;

        char cinsiyet = 'E';

        //Büyük harf ile kompleks Obje veri tripi diye geçer
        String sehir = "Ankara";

        if (yas <35){
            System.out.println("Genç");
        }
        else {
            System.out.println("Yaşlı");
        }

        //i++ ==> 1+1
        for (int i=1; i<=10; i++){
            System.out.println(i+"-Merhaba");
        }

        if (sehir.indexOf("k") >= 0){
            System.out.println("İçinde K harfi var!");
        }

    }

}
