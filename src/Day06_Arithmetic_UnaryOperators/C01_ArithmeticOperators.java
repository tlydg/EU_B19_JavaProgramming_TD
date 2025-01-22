package Day06_Arithmetic_UnaryOperators;

public class C01_ArithmeticOperators {

    public static void main(String[] args) {

        /*

        + - * \ %

        İşlem Önceliği

        1. parantez içi
        2. çarpma bölme %(mod)
        3. toplama çıkarma

        */

        System.out.println("90"+10); //9010
        System.out.println(10+"90"); //1090
        System.out.println(10+10+"90"); //2090
        System.out.println(10+"90"+"10");// 109010
        System.out.println(10+"90"+10+10);  //10901010
        System.out.println(10+20+30+"90"+10+20);  //60901020
        System.out.println(""+10+20+"90");  //102090


        int x=5;
        int y=2;
        int z=x+y; //7
        System.out.println("z = " + z);

        System.out.println("Merhaba" +x+y); //Merhaba52
     //   System.out.println("Merhaba" +x-y); Merhaba dan sonra (x-y) çıkarma işlemi olmaz.
        System.out.println(x-y+"Merhaba" ); // 3Merhaba

        // 5 /2 * 4 % (12-9)

        double num=(double) 5 / 2 *4 % (12-9);

        //                   5 / 2 *4 %  3
        //                     2.5 * 4 % 3
        //                     10 % 3 ( 10 u 3 e böldük kalan 1 dir)
        //                     1

        System.out.println("num = " + num);


    }
}
