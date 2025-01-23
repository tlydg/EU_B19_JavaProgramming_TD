package Day13_Ternary;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {
        // Verilen üç rakamdan en büyüğünü yazdıran kod nedir.


        int x = 1000;
        int y = 200;
        int z = 30;
        int max ;

       // if else

        if (x > y){
            if (x > z){
                max =x;
            }else {
                max =z;
            }
        } else if (y > z) {
            max = y;
        }else{
            max =z;
        }

        System.out.println("max = " + max);

        // else if 2.yol

        if (x > y && x >z){

            max = x;
        } else if (y>z) {
            max = y;
        }else {
            max =z;
        }

        System.out.println("max = " + max);

        // ternary // bir şartın gerçekleşmesi durumunda birden fazla kod satırı çalışacaksa mutlaka
        // if else kullanılmaldır.
        // ternary de sadece tek statement kullanılır.

        int max1= x > y
                ? x > z ? x : z
                : y > z ? y : z;

        System.out.println("max1 = " + max1);

        int max2 = (x > y && x > z)
                ? x
                : y > z ? y : z;

        System.out.println("max2 = " + max2);

        int max3 = (x > y)
                ? (x > z) ? x : z
                : (y > z) ? y : z;

        System.out.println("max3 = " + max3);


    }
}
