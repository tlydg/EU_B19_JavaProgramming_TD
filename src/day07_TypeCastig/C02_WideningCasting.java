package day07_TypeCastig;

public class C02_WideningCasting {

    public static void main(String[] args) {

        // byte < short< int < long < float < double

        byte b=127;
        short sh=45;

        sh=b; // widening casting, implicit casting - automatic

        System.out.println("sh = " + sh);

        int i =14;

        i=sh; // widening casting, implicit casting - automatic

        long l = 5355678899l;

        l=b;

        System.out.println("l = " + l);

        float f=2.5f;
        double d=5.6;

        d=f; // widening casting, implicit casting - automatic

        System.out.println("d = " + d);


    }
}
