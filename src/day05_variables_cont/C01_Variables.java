package day05_variables_cont;

import java.util.Locale;

public class C01_Variables {

    public static void main(String[] args) {

        String name = "Ahmet";
      System.out.println("name.toUpperCase() = " + name.toUpperCase());
        // yukarıdaki String Non Primitive (obje) olduğu için özellik atanabiliyor ve AHMET şeklinde büyük yazılabiliyor.
        //ama Primitive olanlara özellik atayamazsın, int olanlara özellik atanmaz.

        System.out.println("name = " + name);

        int age = 30;

        // declaration
        String surname;

        // non primitivi data typelerine eğer değer atanmadıysa default null alır.

        surname = "Yılmaz"; // assignment -- atama
        System.out.println("surname = " + surname);

        byte b1 = 10;  // -128 ile 127 arasında değer alır.
        byte b2 = 20;
        // byte, short ve int ile yapılan matematiksel işlemlerin sonucu her zaman int dir

        int i = b1 + b2;

        // boolean isOpen = true;

        boolean control = ( age> 20);
        System.out.println("control = " + control);

        System.out.println("age = " + age);

        // iki sayının eşit olup olmadığı

        boolean isEqual;

        isEqual = b1 == b2 ;

        System.out.println("isEqual = " + isEqual);

        // declaration
        int a=5, b =10, c;

        int e =a, d;

        int x;
        int y;   // clean code








    }


}
