package practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {




        // 1    once cumlenin basindaki ve sonundaki bosluklardan trim() kullanarak kurtulduk.
        // 2    replaceAll("\\d", "") ile cumle icindeki rakamlari hiclik ile degistirdik.
        // 3    replace(" " , "x") ile cumle icindeki bosluklari x karakteri ile degistirdik.
        // 4    replaceAll("\\W", "") ile cumlede word olmayan karakterden yani @ isaretinden kurtulduk.
        // 5    replace("x", " ") ile x ile bosluk karakterini degistirip eski haline cevirdik.
        // 6    en son olarak replace("C", "c") ile buyuk C harfini kucuk C ile degistirdik.

String str="   Java ogrenmek123 Cok guzel@      ";

        System.out.println(str.trim().replaceAll("\\d","").replaceAll(" ","x")
                .replaceAll("\\W","").replaceAll("x"," ").replace("C","c"));


    }
}
