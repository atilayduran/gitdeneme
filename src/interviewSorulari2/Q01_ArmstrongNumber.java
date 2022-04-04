package interviewSorulari2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi=scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrong(sayi);
    }
//soru 2 icin
    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i = 0; i <=sayi ; i++) {
            armstrong(i);//recursive method uyguladik
            System.out.println("************************");

        }








    }

    private static void armstrong(int n) {
        int sayininKupleriToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=n;

        while (n>0){
            basamaktakiSayi=n%10;
            sayininKupleriToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            n=n/10;
        }
        if (girilenSayi==sayininKupleriToplami)
            System.out.println(girilenSayi +" armstrong sayisi");
        else System.out.println(girilenSayi +"armstrong degil");

    }
}
