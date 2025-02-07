package day20_CustomMethods;

public class C02_CustomMethodpractice {
    public static void main(String[] args) {
        helloWorld();
        System.out.println("---------");
        System.out.println();
        countDownTenToZero();
        System.out.println();
        System.out.println("----------------");
        countDownTenToZero2();
        System.out.println();
        System.out.println("----------------");
        evenNumbers();
    }
    public static void helloWorld(){
        for (int i = 1; i <= 5 ; i++) { // initialition--condition--increment or decrement
            System.out.println("Hello World");
        }
    }
    // bir metod yazın 10 dan 0 a kadar rakamları yazsın.
    public static void countDownTenToZero(){
        for (int i = 10; i > 0  ; i--) { // initialition--condition--increment or decrement
            System.out.print(i+ "");
        }
    }
    public static void countDownTenToZero2(){
        int i=10;
        while(0<i){
            System.out.print(i+ "");
            i--;
        }
    }
    // 0 ile 100 arasındaki çift sayıları yazan bir method yazın.
    public static void evenNumbers (){
        for (int i = 0; i <= 100 ; i++) {
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
    }
}
