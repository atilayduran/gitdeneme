package practice_basic_day02;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char not='C';

                String sonuc = not=='A'?"gayet basarili":not=='B'?"basarili":not=='C'?"ha gayret":"hatali giris";

        System.out.println(sonuc);
    }
}
