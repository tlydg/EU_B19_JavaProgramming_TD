package day26_StringClass01;

import day22_ClassObject.Car;

public class C01_StringInto {
    public static void main(String[] args) {

        System.out.println("Java da String bir obje üretmek");
        // 1. By String literal vaw
        //    Stack   Heap(String Pool)

        String str1 = "Java";
        String str3 = "Java";

        System.out.println("str1 --------> " + System.identityHashCode(str1));
        System.out.println("str3 --------> " + System.identityHashCode(str3));

        // 2. By new keyword (new String())
        //    Stack            Heap

        String str2= new String("Merhaba");
        String str4= new String("Merhaba");

        System.out.println("str2 --------> " + System.identityHashCode(str2));
        System.out.println("str4 --------> " + System.identityHashCode(str4));

        System.out.println(str1==str3); //HashCode karşılaştırır.
        System.out.println(str2==str4); //HashCode karşılaştırır
        System.out.println(str2.equals(str4)); // HashCodeları değil Metinleri karşılaştırıyor
        // bu sebepten true oluyor.

        // String bir değişkende iki metnin aynı metin olup olmadığını kontrol etmek isterseniz
        // equals() methodunu kullanmalısınız.


        Car car = new Car();
        car.marka ="Tesla";
        car.model = " Model X";
        car.dur();


    }
}
