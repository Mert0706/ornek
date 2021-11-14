package com.bilgeadam.ornek;

public class StaticDeneme {

    //Instance variable
     int sayi1;

     //Class variable - değişken static ise class variable'dir.
     static int sayi2; //static değişken

    public static void main(String[] args) {

        //Static olmayan değişkene, static metoddan erişilemez.
        //Erişmek istiyorsak, class'ın kendi objesini oluşturarak erişeceğiz.

        //Local variable'ı biz initialize etmek zorundayız.
        //Yani ilk değer vermek zorundayız.
        int sayi3=0;

        StaticDeneme sd = new StaticDeneme();

        System.out.println("Sayı1:" +sd.sayi1);
        System.out.println("Sayı2:" +sayi2); //static değişken az kullanılır normal değişken kullanılır.
        System.out.println("Sayı3:" +sayi3);

        //web uygulamalarında main method kullanılmaz dekstoplarda main method genelde kullanılır.
    }

}
