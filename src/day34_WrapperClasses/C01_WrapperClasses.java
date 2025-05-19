package day34_WrapperClasses;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        System.out.println("Wrapper Class in Java");
        System.out.println("Primitive data types");

        boolean bl = true;
        byte by=12;
        short sh = 12500;
        int i = 123;
        long l=12234567788888L;
        float fl= 1234566778.44444f;
        double d= 1334566778.44444f;
        char ch='A';

        System.out.println("bl = " + bl);
        System.out.println("by = " + by);
        System.out.println("sh = " + sh);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("fl = " + fl);
        System.out.println("d = " + d);
        System.out.println("ch = " + ch);

        // wrapper Classes
        // 1. Constructor----> Bu kullanımdan kaldırılacak (deprecated)

        Integer iWrp = new Integer(1234);
        Integer iWrpStr = new Integer ("12345");

        Boolean blWrp = new Boolean(true);
        Boolean blWrpStr = new Boolean("false");

        Byte byWrp = new Byte((byte)12);
        Byte byWrpStr = new Byte("123");

        Character chWrp = new Character('A'); //String değer veremiyoruz


        System.out.println("iWrp = " + iWrp);
        System.out.println("iWrpStr = " + iWrpStr);



        // 2. yol - valueof()
        Integer iWrpVl = Integer.valueOf(1000);
        Integer iWrpVlStr = Integer.valueOf("16423");

        Character chWrpVl = Character.valueOf('a');

        Boolean blWrpVl = Boolean.valueOf("TRUE");
        Boolean blWrpVlStr = Boolean.valueOf(false);

        System.out.println("blWrpVl = " + blWrpVl);


        // 3. yol Assigning Literal Way
        Integer iLtr = 4356;
        Character chLtr='C';
        Boolean blLtr=true;



        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("iWrpStr = " + iWrpStr);
        System.out.println("iWrpVlStr = " + iWrpVl);
        System.out.println(iWrpStr+iWrpVl);

        System.out.println("System.identityHashCode(iLtr) = " + System.identityHashCode(iLtr));
        System.out.println("System.identityHashCode(blWrp) = " + System.identityHashCode(blWrp));

        System.out.println("---------------------------");

        Integer sayi1=12345;
        Integer sayi2=12345;

        System.out.println("(sayi1==sayi2) = " + (sayi1 == sayi2));  // false
        System.out.println("sayi1.equals(sayi2) = " + sayi1.equals(sayi2)); // true

        sayi1=sayi2;
        System.out.println("System.identityHashCode(sayi1) = " + System.identityHashCode(sayi1));
        System.out.println("System.identityHashCode(sayi2) = " + System.identityHashCode(sayi2));

        // Integer cashing -128 ile 127 arsındaki sayılar için == operatörü kullanılabilir

        Integer number1=-128;
        Integer number2=-128;
        System.out.println("number1==number2 = " + (number1 == number2));




    }
}
