package Day13_Ternary;

public class C03_TernaryOperator {

    public static void main(String[] args) {

        // if in basit hali
        // (condition) ? cod (true ) : code (false)

        // sayının çift mi tek mi oldugunu yazdıran kod nedir?

        int number = 12;

        // if-else

        if (number % 2 == 0){
            System.out.println(number + " sayı çiftir. ");
        }else {
            System.out.println(number + " sayı tektir. ");
        }

        //ternary
        System.out.println(number %2 == 0 ? "sayı çiftir. " :"sayı tektir. " );

       String mesaj = number %2 == 0 ?  "sayı çiftir. " :  "sayı tektir. ";
        System.out.println("mesaj = " + mesaj);

        // kod hata verir.
        // number % 2 == 0 ? System.out.println("sayısı çifttir.") : System.out.println("sayısı tektir.");

        // eğer ternary soucunda oluşan değer bir değişkene atanmayacaksa,
        // ? ve : sonraki değerlerin data tipi farklı olabilir

        System.out.println(number %2 ==0 ? "sayı çiftir. " : number *2 );

     // int s=  number %2 ==0 ? "sayı çiftir. " : number *2;  hata verir.
        // bir şartın gerçekleşmesi durumunda birden fazla  kod satırı çalışacaksa mutlaka if-else kullanılmalıdır.
        // ternary'de sadece tek statement kullanılır.
        if (number % 2 == 0) {
            System.out.println(number + " sayısı çifttir.");
            System.out.println(number + " sayısı çifttir.");
            System.out.println(number + " sayısı çifttir.");
            System.out.println(number + " sayısı çifttir.");
        } else {
            System.out.println(number + " sayısı tektir.");
            number = number*number;
        }



    }
}
