package day08_Assingment_Relational_Logical_Operators;

public class C05_SwappingTwoNumbers {

    public static void main(String[] args) {

        // Verilen iki sayinin degerlerini birbirleriyle degistiren kod nedir;

        int sayi1 = 15;
        int sayi2 = 33;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // 1.cozum // gecici bir 3. degisken kullanilarak.
        int temp;
        temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp ;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // 2. cözüm
        sayi1 +=  sayi2 ;
        sayi2 = sayi1 - sayi2;
        sayi1 -=  sayi2;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


    }
}
