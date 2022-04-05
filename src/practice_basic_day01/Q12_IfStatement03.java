package practice_basic_day01;


import java.util.Scanner;

public class Q12_IfStatement03 {
    /*
    Print "Lutfen is unvaninizi girin
    jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
    Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
    Eger jobTitle  qa ise print is unvaniniz Quality Analyst
    test data: qa ise print Quality Analyst
    dev ise print Developer
    ba ise print Business Analyst
    pm ise print Project Manager
   */
    public static void main(String[] args) {

        System.out.println("Lutfen is unvaninizi girin :");
        Scanner scan = new Scanner(System.in);
        String jobTitle = scan.nextLine().toLowerCase();

        switch (jobTitle) {

            case "qa":
                System.out.println("Quality analyst");
                 break;
            case "dev":
                System.out.println("developer");
                break;
            case "ba":
                    System.out.println("business analyst");
                    break;
            case "pm":
                System.out.println("Project manager");
                break;

                default:
                    System.out.println("hatali giris");

        }
    }
}

