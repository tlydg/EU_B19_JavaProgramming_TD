package day08_Assingment_Relational_Logical_Operators;

public class C09_LogicalOR {

    public static void main(String[] args) {

        // truth table OR
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        int i1 =15;
        int i2 =10;

        // tekli operand
        boolean result1 = (i1 > i2) | ( i1 <= i2);
        System.out.println("result1 = " + result1); //true

        // ciftli operand

        boolean result2 = (i1 != i2) || ( i1 >= i2);
        System.out.println("result2 = " + result2); // true

        // tek operator ile çift operator arasındaki fark sonuçla ilgili değildir.
        // performans ile ilgilidir.



    }

}
