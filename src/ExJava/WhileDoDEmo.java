package ExJava;

public class WhileDoDEmo {
    public static void main(String[] args) {

        // i 1 den 5 e kadar deger alabilirdi
        // i degerlerini konsola yazdır

        for (int i = 1; i <=5 ; i++) {
            System.out.println("For loop u ile " +i);
        }
        System.out.println("--------------------");

        int j=1;
        while (j<=5){
            System.out.println("While loop ile sayımız "+j);
            j++;

        }
        System.out.println("--------------------");
        int k=1;
        while (true){
            if (k > 5){
                break;
            }
            System.out.println("While loop ile sayımız "+k);
            k++;

        }

        System.out.println("--------------------");
        int sayi =1;
        do {
            System.out.println("Do While loop ile sayımız "+sayi);
            sayi++;
        }while (sayi <=5);

    }
}
