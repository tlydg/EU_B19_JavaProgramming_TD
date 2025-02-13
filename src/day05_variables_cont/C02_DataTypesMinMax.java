package day05_variables_cont;

public class C02_DataTypesMinMax {

    public static void main(String[] args) {

        //byte
        byte byteMin =Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        //short
        short  shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);

        short shortMax =Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);

        //int
        int intMin= Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        int intMax =Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);

        //long
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE); // değer atamadan direk çağırdık
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);


        //Float
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);

        //Double
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_EXPONENT = " + Double.MAX_EXPONENT);


    }
}
