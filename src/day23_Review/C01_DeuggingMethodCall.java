package day23_Review;

public class C01_DeuggingMethodCall {
    public static void main(String[] args) {

        System.out.println("Main method ierisindeyim : satır 6");
        metod();
        System.out.println("Main method ierisindeyim : satır 8");
        metod();
        System.out.println("Main method ierisindeyim : satır 10");
        metod();
        System.out.println("Main method ierisindeyim : satır 12");
    }

    public static void metod(){
        System.out.println("Method içerisindeyim : satır");
    }
}
