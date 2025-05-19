package day12_Switch_Case;

import java.util.Scanner;

public class C10_SwitchCaseHomework2 {
    public static void main(String[] args) {
        /*
        Write a program to display months:
        1-January
        2-February
        3-March
        4-April
        5-May
        6-June
        7-July
        8-August
        9-September
       10-October
       11-November
       12-December
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarası giriniz (1-12) : ");
        int ayNumarasi = input.nextInt();
        input.nextLine();
        String ayAdi = "";
        String mevsim = "";

        switch (ayNumarasi){
            case 1 -> ayAdi = "Ocak";
            case 2 -> ayAdi = "Subat";
            case 3 -> ayAdi = "Mart";
            case 4 -> ayAdi = "Nisan";
            case 5 -> ayAdi = "Mayıs";
            case 6 -> ayAdi = "Haziran";
            case 7 -> ayAdi = "Temmuz";
            case 8 -> ayAdi = "Agustos";
            case 9 -> ayAdi = "Eylül";
            case 10 -> ayAdi = "Ekim";
            case 11 -> ayAdi = "Kasım";
            case 12 -> ayAdi = "Aralık";
            default -> System.out.println("geçersiz ay bilgisi");
        }
        switch (ayNumarasi){
            case 12,1,2 -> mevsim = "kis";
            case 3,4,5 -> mevsim = "ilkbahar";
            case 9,10,11 -> mevsim = "sonbahar";
            default -> System.out.println("Geçersiz mevsim bilgisi");
        }
        if (ayAdi != ""){
            System.out.println("Ayin Adi " + ayAdi+ " 'dir." + " Ve " + mevsim + " mevsimi ' dir. ");

        }
    }
}
