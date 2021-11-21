package com.bilgeadam.ornek;

public class RelationalOrnek {
    public static void main(String[] args) {

        // == != > >= < <=

        int sayi1 = 9;
        int sayi2 = 9;

        String isim1 = "Mustafa";
        String isim2 = "Mustafa";

        String isim3 = new String("Bora");
        String isim4 = new String("Bora");

        if (sayi1 == sayi2)
            System.out.println("Eşit");
        else
            System.out.println("Eşit Değil");

        if (isim1 == isim2)
            System.out.println("İsimler Eşit");
        else
            System.out.println("İsimler Eşit Değil");

        System.out.println("İsim3:" + isim3);

        if (isim3 == isim4)
            System.out.println("Obje İsimler Eşit");
        else
            System.out.println("Obje İsimler Eşit Değil");


        // String'de == değerine bakmazi memory'deki adresine bakar.
        // ÖNEMLİ !!!! --> String ifadeler  == ile değil, equals metodu ile kontrol edilir.
        //String'de equals, oluşturulma biçiminden bağımsız olarak hep doğru çalışır.
        if (isim3.equals(isim4))
            System.out.println("Equals İsimler Eşittir.");
        else
            System.out.println("Equals İsimler Eşit Değildir.");

    }
}
