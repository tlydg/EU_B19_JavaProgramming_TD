package day08_Assingment_Relational_Logical_Operators;

public class C07_RelationalOperators {
    public static void main(String[] args) {

        int num1 = 125, num2 =45;


        // `==` is equal operator
        boolean b = (num1== num2) ;
        //  boolean b = (num1== num2) ; bu sekilde gosterim daha okunaklidir.

        System.out.println("b = " + b);

        System.out.println("num1 == num2 ?" + (num1 == num2)); // false

        // `!=` is not equal operator
        System.out.println("num1 == num2 ?" + (num1 != num2)); // true

        // `>` is larger operator
        System.out.println("num1 == num2 ?" + (num1 > num2)); // true

        // `<` is not equal operator
        System.out.println("num1 == num2 ?" + (num1 < num2)); // false

        // `>=` is not equal operator
        System.out.println("num1 == num2 ?" + (num1 >= num2)); // true

        // `<=` is not equal operator
        System.out.println("num1 == num2 ?" + (num1 <= num2)); // false

        String str = "10";
       // System.out.println(str > num1); hata verir


        double db1 =25.4;
        double db2 = 25.4;
        System.out.println(db1 >=db2);




    }
}
