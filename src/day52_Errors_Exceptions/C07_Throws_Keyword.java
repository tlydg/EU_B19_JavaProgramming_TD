package day52_Errors_Exceptions;

public class C07_Throws_Keyword {

    public static void main(String[] args)throws InterruptedException {

        String str = "Java";

        System.out.println(str);

        sleep(2.1); // not yaz

      //  Thread.sleep(5000);

        String str2 = "C++";
        System.out.println(str2);
    }

    public static void sleep (double seconds) throws InterruptedException{
        Thread.sleep( (long) seconds); // kontrol et
    }
}
