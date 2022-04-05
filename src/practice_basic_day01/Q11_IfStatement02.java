package practice_basic_day01;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen not giriniz ve harf karsiligini al");
        Scanner scan;
        int sayi = scanner.nextInt();

        if (sayi>=90){
            System.out.println("A");
        }else if (sayi>=80){
            System.out.println("B");
        }else if (sayi>=70){
            System.out.println("C");
        }else if (sayi>=60) {
            System.out.println("D");
        }else if (sayi<60&& sayi>=0) {
            System.out.println("F");

        }else System.out.println("hatali giris yaptiinz");
        }
}