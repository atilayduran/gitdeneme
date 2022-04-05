package practice_basic_day01;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen y yada n giriniz");
        char harf=scanner.next().charAt(0);

        if (harf=='y' || harf=='Y'){
            System.out.println("yes");
        }else if(harf=='n'|| harf=='N'){
            System.out.println(("no"));
        }else
            System.out.println("hatali giris yaptiniz");
    }
}
