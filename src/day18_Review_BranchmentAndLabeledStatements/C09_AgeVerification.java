package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C09_AgeVerification {
    public static void main(String[] args) {
        //while
        // 0 dan küçük 100 den büyük yaş girildiğinde tekrar yaş giriniz mesajı veren loop
        // yapalım. Yaş 0 - 100 arasında olunca loop sonlansın.

        Scanner input = new Scanner(System.in);
        int age ;

        while (true){
            System.out.print("Yaşınızı giriniz : ");
            age = input .nextInt();
            if (age > 0 && age <= 100) {
                break;
            }
        }
        System.out.println("age = " + age);

    }
}
