package day08_Assingment_Relational_Logical_Operators;

public class C01_WideningCasting {

    public static void main(String[] args) {

        byte b = 25;
        short s;
        s=b;
        System.out.println("s = " + s); //25

        int i = s;
        System.out.println("i = " + i); //25

        long l = i;
        System.out.println("l = " + l); //25

        double d = l;
        System.out.println("d = " + d); //25.0

        int sayi = 10/3 ;
        System.out.println("sayi = " + sayi); //3

        double sayi1 = 10/3;
        System.out.println("sayi1 = " + sayi1); //3.0

        String name = "Yasemin" ;
        // double db = name ; // bu data tipleri tamamen farklidir. cast olmaz.





    }
}
