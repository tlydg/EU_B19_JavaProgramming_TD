package day08_Assingment_Relational_Logical_Operators;

public class C03_AssingmentOperators {

    public static void main(String[] args) {

         // declaration
        int num1 , num2 ;

        // `=` assignment operator
        num1 = 10;
        num2 = 5;

        // += assignment operator
        num1 += num2; // num1 = num1 + num2 ;  //15
        System.out.println("num1 = " + num1);

        // -= assignment operator
        num1 -= num2;  // num1 = num1 - num2  //10
        System.out.println("num1 = " + num1);

        // *= assignment operator
        num1 *= num2;  // num1 = num1 * num2  //50
        System.out.println("num1 = " + num1);

        // -= assignment operator
        num1 /= num2;  // num1 = num1 / num2  //10
        System.out.println("num1 = " + num1);

        // %= assignment operator
        num1 %= num2;  // num1 = num1 % num2 //0
        System.out.println("num1 = " + num1);

        String str = "Hasan" ;
        String s = "Akcay" ;

        str += s; //   str = str + s ;
        str += s; //   str = str + s ;

        System.out.println("str = " + str);


    }
}
