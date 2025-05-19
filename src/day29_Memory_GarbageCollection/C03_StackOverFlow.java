package day29_Memory_GarbageCollection;

public class C03_StackOverFlow {

     /*
    public static void birMethod(){
        System.out.println("Deneme");
    }
    */

    public static void recursiveMethod(int sayi) {
        System.out.println("sayi = " + sayi);
        recursiveMethod(sayi+1);

    }


    public static void recursiveMethod2(int sayi, int count){
        System.out.println(sayi);

        if (sayi>=count){
            return;
        }

        recursiveMethod2(sayi+1, count);
    }

    public static void main(String[] args) {
        /*
        for (int i = 0; i < 100_000_000; i++) {
            birMethod();   //  her seferinde method işini bitireceğinden dolayı
            // stackde atılacak ve stackOverFlow vermeyecek
        }
        */

        // recursiveMethod(1); //StackOverflowError hatası verir -- Method bitirilmediği için

        recursiveMethod2(1,18000);  // count parametresinin değerine göre stack alanına sığacak
        // kadar method çağrısı yapılırsa hata oluşabilir

    }


}
