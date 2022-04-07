package practice_basic_day02;

import java.util.Scanner;

public class Q07_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and last name :");
        String firstname = scan.nextLine().toUpperCase(),
                lastname = scan.nextLine().toUpperCase();  //multiple declarations, bu sekilde kullanim uygulanabilir

        System.out.println(firstname+ " "+ lastname);



        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz

        String string1 ="01234";
        String string2 ="56564";

        System.out.println(string1.concat(string2));
        System.out.println(string1+string2);




    }
}
