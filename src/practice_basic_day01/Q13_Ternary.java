package practice_basic_day01;

import java.util.Scanner;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        System.out.println("fiyat giriniz");
        int fiyat= scanner.nextInt();

        String sonuc = fiyat<10?"ucuz":fiyat<20?"normal":"pahali";

        System.out.println(sonuc);

    }
}
