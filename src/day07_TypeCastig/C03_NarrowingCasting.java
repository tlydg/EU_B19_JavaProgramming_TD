package day07_TypeCastig;

public class C03_NarrowingCasting {
    public static void main(String[] args) {
      /*
        byte b = 5;
        short sh=129;

        b= (byte) sh; // narrowing - explicit - manual casting

        // küçük bir veri tipine büyük bir veri tipi atacaksam yukarıdaki işlemi yapacağım.

        System.out.println("b = " + b);

        int x=130;
        byte y=(byte) x;
        System.out.println("y = " + y);

        float fl= 2334.5f;  // narrowing - explicit - manual casting
        int i = (int) fl;

        System.out.println("i = " + i);

        short b1=30;
        short b2=40;

        short z= (byte) (b1-b2);  // değer kaybı olur yine // narrowing - explicit - manual casting

        System.out.println("z = " + z);

        int sayi1=b1*b2;

        */

        byte sayi1=1;
        byte sayi2=10;
        short toplam= (short)(sayi1*sayi2);

        double d=5.2;
        int y=2;


        float z= (float) (d+y);

        System.out.println("z = " + z);


    }
}
