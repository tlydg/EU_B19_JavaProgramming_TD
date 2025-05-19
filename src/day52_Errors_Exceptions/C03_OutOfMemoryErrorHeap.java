package day52_Errors_Exceptions;

public class C03_OutOfMemoryErrorHeap {
    public static void main(String[] args) {

        System.out.println("I declared a big size array of int.");

        int [] bigArray = new int [10];
        // int [] bigArray = new int [1_500_000_000];

        try{
           bigArray = new int [1_500_000_000]; // hatayı bu şekilde alarsam
        }catch (OutOfMemoryError e){
            System.out.println("Hata oluştu :"+e.getMessage());
            bigArray= new int[1_000_000_000]; // array i buraya çek diyorum
        }
        System.out.println("bigArray.length = " + bigArray.length);

        System.out.println("Program çalışmaya devam ediyor...");


    }
}
