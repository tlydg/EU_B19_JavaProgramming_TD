package day04_variables;

public class C02_VariablePractice {

    public static void main(String[] args) {
        byte sinifMevcudu;
        sinifMevcudu = 10;

        System.out.println(sinifMevcudu);

        short num1 = 30000;
        int num2 = 814578;

        System.out.print("Sınıf Mevcudu=");
        System.out.println(sinifMevcudu);
        System.out.println(num1);
        System.out.println(5); // parantez içinde sayı yazarsın ama metini tırnak içinde yazmalısın.

        System.out.println(5 + 4);

        System.out.println("---------------------");

        System.out.println("Sınıf Mevcudu = " + sinifMevcudu);
        System.out.println("sinifMevcudu = " + sinifMevcudu);
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        System.out.println("----------------");

        long num3 = 9_999_999L;
        System.out.println("num3 = " + num3);
        System.out.println(num1 + 5);

        System.out.println("---------------");
        char ch1 = 'A';
        System.out.println("ch1 = " + ch1);

        System.out.println("----------------");
        boolean isMarried = 5 < 4;  // boolen çok önemli koşul oluşturur.
        System.out.println("isMarried = " + isMarried);

        System.out.println("----------------");

        //pi=3.14  bu bir tam sayı değil bu yüzden double kullanıyoruz.
        // sabit sayı ismi büyük harfle yazılır.
        //  constants names can be all capital.
        double PI = 3.14;
        System.out.println("PI = " + PI);


        float kalemUcu = 0.5f; // yanına f yazılır.
        System.out.println("kalemUcu = " + kalemUcu);

        //double ve float un değer atamazsam onu default double alır.
        System.out.println("-----------------");

        String str = "Eurotech Study is good.";
        System.out.println("str = " + str);

        // bütün satırları hizalama için ctrl+alt+l

        num1 = 234;

        str = "5";
        System.out.println(str + 3);


    }
}
