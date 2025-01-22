package day10_IfStatements;

public class C02_If_Cont {

    public static void main(String[] args) {

        int x=4;
        boolean a= (x<=5); // true

        if (a) {
            System.out.println(x + " 5 e eşit ya da küçüktür");
            System.out.println(x++);

        }
        System.out.println(x);
        // body kullanırsak eğer False sonuç ilk iki satırı atlar en son satırı yazar.



    }
}
