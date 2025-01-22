package day08_Assingment_Relational_Logical_Operators;

public class C13_LogicalORveANDOperator {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = 40;

        System.out.println((a>b) && (a++ < c)); //


        System.out.println(a); //

        int a1 = 20;
        int b1 = 30;
        int c1 = 40;

        System.out.println((a1>b1) & (a1++ < c1));

        System.out.println("a1 = " + a1); // 21


    }
}
