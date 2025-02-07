package day19_Methods1;

public class C04_DebuggingMethod {
    public static void main(String[] args) {
        System.out.println("Main metod içi : -5");
        metod();
        System.out.println("Main metod içi : -7");
        metod();
        System.out.println("Main metod içi : -9");
        metod();
        System.out.println("Main metod içi : -11");
        metod();
    }
    public static void metod (){

        System.out.println("Metod içi : satır -17");
    }
}
