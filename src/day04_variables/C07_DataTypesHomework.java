package day04_variables;

public class C07_DataTypesHomework {

    public static void main(String[] args) {

        boolean isFiyat= 10>9; // true
        System.out.println("isFiyat = " + isFiyat);

        double alan =10.1;
        System.out.println("alan = " + alan); // 10.1

        boolean isButce = 49>50; // False
        System.out.println("isButce = " + isButce);

        byte childAge=5;
        System.out.println("childAge = " + childAge); // 5

        byte weatherDegree = -4;
        System.out.println("weatherDegree = " + weatherDegree); // -4

        char ch2= 'a';
        System.out.println("ch2 = " + ch2); // a

        char ch3 ='z';
        System.out.println("ch3 = " + ch3); // z

        char ch4 ='&';
        System.out.println("ch4 = " + ch4); // &

        double cevre= 120;
        System.out.println("cevre = " + cevre); // 120

        double bolge= 120.005;
        System.out.println("bolge = " + bolge); // 120.005

        double bolge2 = 550.24;
        System.out.println("bolge2 = " + bolge2); // 550.24


        float f1= 123.3365f;
        System.out.println("f1 = " + f1);

        float f2 =3.55f;
        System.out.println("f2 = " + f2);

        int h1 =15;
        System.out.println("h1 = " + h1);

        int h2 =100;
        System.out.println("h2 = " + h2);

        int h3 =120;
        System.out.println("h3 = " + h3);

        int h4 = -6500;
        System.out.println("h4 = " + h4);

        short s1 =12;
        System.out.println("s1 = " + s1);

        short s2=23;
        System.out.println("s2 = " + s2);

        short s3= -100;
        System.out.println("s3 = " + s3);


        //3. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
        //                                   length
        //                                   width
        //
        //                                   area = length * width
        //                                   perimeter =  2 * (length + width)

        double length =5; // uzunluk
        double width =3;  // genislik

        double area = length*width; //15
        double perimeter = 2* (length + width); //16

        System.out.println("area = " + area); //15
        System.out.println("perimeter = " + perimeter); //16


    }








}
