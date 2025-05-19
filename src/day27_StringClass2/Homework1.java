package day27_StringClass2;

public class Homework1 {
    public static void main(String[] args) {

        //Kullanıcın girdiği  bir kelimenin 2. yarısını
        // döndüren bir program yazdırın.
        //Sanayagı yagı Mutluluk uluk

        System.out.println("secondHalf(\"Sanayagı\") = " + secondHalf("Sanayagı"));

        String str = "Mutluluk";
        System.out.println(str.substring(str.length() / 2));

        System.out.println("------------------");

        // Metodla yaparsak
    }
    public static String secondHalf(String word){
        return word.substring(word.length() / 2);

    }
}
