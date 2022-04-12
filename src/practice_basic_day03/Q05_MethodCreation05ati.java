package practice_basic_day03;

import java.util.Scanner;

public class Q05_MethodCreation05ati {
    /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");

        int alinanSayi = scan.nextInt();
        System.out.print(sayi1 + "-");
        System.out.print(sayi2 + "-");
        if (alinanSayi < 47) {
            for (int i = 2; i <= alinanSayi; i++) {
                sayi3=sayi1+sayi2;
                System.out.print("-" +sayi3 );
                sayi1=sayi2;
                sayi2=sayi3;



            }
        }


    }
}////nt sayi1 =0;
//int sayi2 =1;
//int sayi3 ;

//    System.out.print(sayi1 +"-");
//            System.out.print(sayi2 +"-");

//            if(sayi<47){
//    for(int i = 2; i<sayi; i++){
//    sayi3 =sayi1 +sayi2;
//    System.out.print("-" +sayi3 );
//    sayi1=sayi2;
//    sayi2=sayi3;
//    }
