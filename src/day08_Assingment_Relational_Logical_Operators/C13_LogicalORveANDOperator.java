package day08_Assingment_Relational_Logical_Operators;

public class C13_LogicalORveANDOperator {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = 40;

        System.out.println((a>b) && (a++ < c)); // False // yani sağ tarafa hiç bakmıyor.

        System.out.println(a); // a=20 olur

        int a1 = 20;
        int b1 = 30;
        int c1 = 40;

        System.out.println((a1>b1) & (a1++ < c1)); // False // burda sağ tarafa bakıp işlem yapıyor.

        System.out.println("a1 = " + a1); // a1=21 olur.

        // OR için

        int a2 = 20;
        int b2 = 30;
        int c2 = 40;

        System.out.println((a2>b2) || (a2++ < c2)); // true

        System.out.println(a2); // a2=21 olur


    }
}
