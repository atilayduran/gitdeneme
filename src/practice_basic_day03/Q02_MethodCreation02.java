package practice_basic_day03;

public class Q02_MethodCreation02 {
    /*
            Problem tanımı :
            Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
            Test Data:
            input: "aabbcccccddddaaa"
            output: abcd
         */
    public static void main(String[] args) {

        String data= "aabbcccccddddaaa";
        tekKarakter(data);


    }

    private static void tekKarakter(String data) {
        String sonuc = "";

        for (int i = 0; i < data.length(); i++) {
           if (!sonuc.contains(data.substring(i,i+1))){

               sonuc+=data.substring(i,i+1);

            }

        }
        System.out.println(sonuc);
    }


}
