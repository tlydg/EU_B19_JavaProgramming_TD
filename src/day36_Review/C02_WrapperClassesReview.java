package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_WrapperClassesReview {

    public static void main(String[] args) {
        Integer i;
        Byte b;
        Short s;
        Double d;
        Float f;
        Boolean bl;
        Character ch;
        Long l;
        // primitive data türlerinin objeye dönüşmüş hali.
        // Boxing
        Integer intOb = Integer.valueOf(10);
        // Auto Boxing
        Integer intOb1 = 10;

        Integer obje = 25;
        // unboxing
        int y = obje.intValue();
        //Auto unboxing
        int x = obje;

        // Java wrapper classlar ile primitive data türleri arasındaki
        // dönüştürme işlemini otomatik yapar.

        Integer [] arr = {2,3,5,62,-9};
        int c = 25;

        ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));

        //Parse metotları
        String str= "123";

        int z= Integer.parseInt(str);
        Integer w= Integer.parseInt(str);

        System.out.println("(z+w) = " + (z + w));

        double db =Double.parseDouble("25.25");
        System.out.println("db*25 = " + db * 25);

        //Max. Min değerler // en küçük ve en büyük değeri bulmak için kullanacağız.
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);


        //karşılaştırma metodu compare ();
        // Integer. compare(int x, int y);
        // x < y -> -1
        // x == y -> 0
        // x > y -> 1     //özellikle tarih rakam karşılaştirmada kullancaz

        System.out.println("Integer.compare(10,20) = " + Integer.compare(10, 20)); // -1
        System.out.println("Double.compare(5.2,3.8) = " + Double.compare(5.2, 3.8)); // 1




    }
}
