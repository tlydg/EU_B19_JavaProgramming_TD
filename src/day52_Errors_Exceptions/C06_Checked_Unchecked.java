package day52_Errors_Exceptions;

public class C06_Checked_Unchecked {

    public static void main(String[] args) {
        System.out.println("-----------Unchecked Exceptions");

        int a=15;
        int b=0;

       // System.out.println(a/b); // aritmetic exception

        char [] chars = {'A','B','C'};
       // System.out.println(chars[7]); // ArrayIdexOutOfBoundsException

      //  Banka banka=null;
      //  banka.getClass();              // NullPointerException

        String str = "Java";
        str=null;
      //  System.out.println(str.toUpperCase()); // NullPointerException


        System.out.println("--------Checked Exceptions---------------");

        System.out.println("Hi");

      //  Thread.sleep(3000);


    }
}
