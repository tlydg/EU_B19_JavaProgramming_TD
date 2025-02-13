package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C03_SayilarinOrtalamasi {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan 3 adet double türünde sayi girmesini isteyin
        System.out.print("Üç adet double türünde sayi giriniz :");

        double nuber1 = input.nextDouble();
        double nuber2 = input.nextDouble();
        double nuber3 = input.nextDouble();
        //değerleri birbirinden ayırmak için enter ya da space kullanılır.

        //calculate average
        double average = (nuber1+nuber2+nuber3)/3;

        //display results
        System.out.println("The average of "+nuber1+ ", " +nuber2+ " , " +nuber3+ " is "+average);


    }
}
