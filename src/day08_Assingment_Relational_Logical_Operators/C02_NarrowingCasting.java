package day08_Assingment_Relational_Logical_Operators;

public interface C02_NarrowingCasting {

    public static void main(String[] args) {

        short s = 5;
        byte b = (byte) s;
        System.out.println("b = " + b);

        s =300;
        byte b1 = (byte) s;
        System.out.println("b1 = " + b1);  // 44 yani veri kaybi olur

        int i = 45545 ;
        short sh = (short) i;
        System.out.println("sh = " + sh); // -19991

        double d = 2.4;
        int i1 = (int) d;
        System.out.println("i1 = " + i1);

        short number1 = 25;
        short number2 =55;
        short number3 = (short) (number1 +number2); // int dönüstügü için otomatik Casting istiyor.
        System.out.println("number3 = " + number3);

        double num1 = 7;
        double num2 = 7.7;
        double num3 =  num1 + num2 ;

        double x = 25 + 2 +8* .5 ; // islem bir yerde double varsa, sonuc double dir.

        double z = 25/3 ; // veri kaybi olur.
        System.out.println("z = " + z);

        char c1 = 'A';
        char c2 = 'B';

        int v = c1 +c2 ; // böyle bir kullanım yok.
        System.out.println("v = " + v);
        System.out.println( c1 > c2 );

        System.out.println("-----------------------------");
        System.out.println(true + "string" +false);

      //  var h ="Ali"; var metodu tüm veri tiplerini anliyor ama pek kullanilmiyor.











    }
}
