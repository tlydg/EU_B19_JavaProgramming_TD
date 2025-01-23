package Day13_Ternary;

import java.util.Scanner;

public class C08_SwitchCaseToTer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int not;
        String harfNotu ;
        System.out.print("Lütfen notunuzu giriniz : ");
        not = sc.nextInt();

        // Switch Case
        switch (not){
            case 90 :
                harfNotu = "Geçme Notunuz -A";
                break;
            case 80 :
                harfNotu = "Geçme Notunuz -B";
                break;
            case 70 :
                harfNotu = "Geçme Notunuz -C";
                break;
            case 60 :
                harfNotu = "Geçme Notunuz -D";
                break;
            case 50 :
                harfNotu = "Geçme Notunuz -E";
                break;

            default:
                harfNotu = "Geçersiz not / Kaldınız";

        }

        System.out.println("haftNotu = " + harfNotu);
        System.out.println("----------------------------------------");

        // ternary

        harfNotu = (not >=90) ? "Geçme Notunuz -A"
                : (not >=80) ? "Geçme Notunuz -B"
                : (not >=70) ? "Geçme Notunuz -C"
                : (not >=60) ? "Geçme Notunuz -D"
                : (not >=50) ? "Geçme Notunuz -E"
                : "Geçersiz not / Kaldınız";
        System.out.println("haftNotu = " + harfNotu);


    }
}
