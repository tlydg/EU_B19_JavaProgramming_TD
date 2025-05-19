package Day06_Arithmetic_UnaryOperators;

public class C04_UnaryOperators {

    public static void main(String[] args) {

        // ++ --

        int a =10;
        a++; // a =a+1;     // postincrement -- sonrasında artır
        System.out.println(a);

        a--; // a=a-1;     // postdecrement
        System.out.println(a);

        System.out.println("--------------------------");

        ++a;  //  preincrement   : sayının değerini hemen bir arttırıyorum. --öncesinde artır
        System.out.println(a); // 11

        System.out.println(++a); //12

        --a; // predecrement : sayının değerini hemen bir azaltır.

        System.out.println(a); // 11

        System.out.println(--a); // 10

        System.out.println("--------------------------");

        System.out.println(a--); // önce sadece a değerini yazdırır yani sonuç 10

        System.out.println(a);  // burada a yı 1 azaltır yani sonuç 9 olur.

        System.out.println(--a); // 8

        System.out.println(++a); // 9 a=9

        System.out.println(a++); // 9 a=10

        System.out.println(a++); // 10 a=11

        System.out.println(a); // 11

        System.out.println(--a); // 10 a=10

        System.out.println(a++); // 10 a=11

        System.out.println(a--); // 11 a=10

        System.out.println(--a); // 9  a=9

        System.out.println("----------------------");

        int b= 99;
        System.out.println(++b); // 100 b=100

        System.out.println("-------------------");

        int c=99;
        System.out.println(c++); // 99 c=100
        System.out.println(c);   // 100
        System.out.println(c++); // 100 c=101



























    }
}
