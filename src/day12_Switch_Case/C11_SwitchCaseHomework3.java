package day12_Switch_Case;

import java.util.Scanner;

public class C11_SwitchCaseHomework3 {

    public static void main(String[] args) {

        /*   Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil
                degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen
        yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile
        bolunebilen yillardan sadece
        400’un kati olan yillar artik yildir

      */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz : ");
        int yil = input. nextInt();
        if ((yil %4 ==0 && 100 !=0) || (yil % 400 ==0)){
            System.out.println( yil + " bir artık yıldır. ");

        }else {
            System.out.println( yil + " bir artık yıl değildir.");

        }
    }
}
