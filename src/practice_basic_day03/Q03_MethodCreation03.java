package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value to convert meters and kilometers :");
        double sentiMeter = scan.nextDouble();


        donusturucu(sentiMeter);


    }

    private static void donusturucu(double sentiMeter) {

        double metre=sentiMeter*100;
        double km=sentiMeter*100000;
        System.out.println(sentiMeter+ "="+ metre + "metre");
        System.out.println(sentiMeter+ "="+ km + "kilometre");

    }
}