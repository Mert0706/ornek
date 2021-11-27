package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {

    try {


        //Scanner objesiyle consoledan veri okuyabiliyoruz.
        Scanner sc = new Scanner(System.in);

        System.out.print("İsminizi Giriniz:");
        String isim = sc.nextLine();

        System.out.print("Yaşınızı Giriniz:");
        int yas = sc.nextInt();
        //int yas = (int)Double.parseDouble(sc.nextLine());

        if (yas <= 35){
            System.out.println(yas + " Yaşında Yolun 1. Yarısındasın " + isim);
        }else {
            System.out.println(yas + " Yaşında Yolun 2. Yarısındasın " + isim);
        }

    }
    catch (InputMismatchException e){
        System.err.println("Hata: Yaş alanına sayı girmek zorundasınız!");

    }

    catch (Exception e){
        //System.err.println("Hata Oluştu" + e.getMessage());
        e.printStackTrace();
    }

    }
}
