package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in); //mesaj vermeden de konsol da girdi girilir
        String kelime=scan.next();
        System.out.println(kelime.length());

        System.out.println(kelime.substring(kelime.length()-1)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.charAt(0));



    }
}
