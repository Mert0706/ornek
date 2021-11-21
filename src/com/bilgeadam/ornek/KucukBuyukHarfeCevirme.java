package com.bilgeadam.ornek;

import com.bilgeadam.ortak.Ortak;

import java.util.Locale;

public class KucukBuyukHarfeCevirme {
    public static void main(String[] args) {

        String isim = "Mert";

        //Büyük ve Küçük Harfe Çevirme.
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());

        String isim2 = "izmirli İĞDELER";
        System.out.println(isim2.toUpperCase());

        String isim3 = "IĞDIRLI ıspanaklar";
        System.out.println(isim3.toLowerCase());

        // Türkçe Karakter çevirme
        System.out.println(isim3.replace("i", "İ").toUpperCase());
        System.out.println(isim2.replace("I", "ı").toLowerCase());

        //Local
        Locale localeTR = new Locale("tr", "Tr");

        String kelime = "izinli İSTANBUL";
        System.out.println(kelime.toUpperCase(localeTR));

        System.out.println(Ortak.buyukHarfeCevir("iğneli ŞEMSİYE"));


    }
}
