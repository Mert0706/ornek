package com.bilgeadam.ornek;

public class Farkli_if_Ornek {
    public static void main(String[] args) {

        int yas = 29;

        String durum = (yas<35)?"Genç":"Yaşlı";

        System.out.println(durum);


        if (yas<35)
            durum="Genç";
        else
            durum="Yaşlı";
    }

}
