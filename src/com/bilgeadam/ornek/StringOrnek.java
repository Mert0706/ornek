package com.bilgeadam.ornek;

public class StringOrnek {

    public static void main(String[] args) {

        // isim soyisim ayrıma
        // Aziz Sancar

        // indexOf

        String kelime1 = "Trabzon";
        System.out.println(kelime1.indexOf("z"));

        String kelime2 = "Trabzon Lisesi";
        System.out.println(kelime2.indexOf(" ")+1);

        //substring

        String kelime3 = "Trabzon";
        System.out.println(kelime3.substring(5));
        System.out.println(kelime3.substring(2,4));

    }
}
