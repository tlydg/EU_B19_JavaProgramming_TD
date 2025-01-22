package day10_IfStatements;

public class C07_CheckNumbers {

    public static void main(String[] args) {

/*
 //Bir program yazın 2 tane numara kabul etsin ve büyük olanı versin.
 */

        int a =70;
        int b =70;

        if (a>b){

            System.out.println("a = " + a);
        } else if (a==b) {

            System.out.println(" a eşittir b");

        }else {

            System.out.println("b = " + b);
        }

        System.out.println("Program bitti");

    }
}
