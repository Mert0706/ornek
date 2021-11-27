package com.bilgeadam.ornek;

import com.sun.tools.javah.Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole2 {
    public static void main(String[] args) {

        int yas = 0;

        //Scanner objesiyle consoledan veri okuyabiliyoruz.
        Scanner sc = new Scanner(System.in);

        System.out.print("İsminizi Giriniz:");
        String isim = sc.nextLine();

        System.out.print("Yaşınızı Giriniz:");

        try{
            yas = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.err.println("Hata: Yaş alanına sayı girmek zorundasın!");
        }

        //int yas = (int)Double.parseDouble(sc.nextLine());

        if (yas <= 35){
            System.out.println(yas + " Yaşında Yolun 1. Yarısındasın " + isim);
        }else {
            System.out.println(yas + " Yaşında Yolun 2. Yarısındasın " + isim);
        }

    }
}
