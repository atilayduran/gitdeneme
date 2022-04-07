package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {


   Scanner scan = new Scanner(System.in);
        System.out.println("isminizi girniiz");
        String isim=scan.nextLine();
        System.out.println("soyisiminiz girniiz");
        String soyisim= scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("isim daha uzun");
        }else System.out.println("soyisim daha uzun");





    }
}
