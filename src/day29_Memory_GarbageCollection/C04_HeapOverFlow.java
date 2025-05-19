package day29_Memory_GarbageCollection;

public class C04_HeapOverFlow {
    public static void main(String[] args) {
        //    STACK      HEAP
        String str1 = "Merhaba"; // Immutable -- değiştirilemez silinemez
        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));


        str1="Merhaba Java";
        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));


        int counter=0;


        // OutOfMemoryError  (heap space) hatası oluşur. str1 değişkeni öyle bir değere tamasına gelir ki
        // nesnenin büyüklüğü heap e sığmaz ve hata verir
        while(true){
            System.out.println(counter++);
            str1+=str1;  // Her sefreinde yeni bir nesne oluşturup
            // karakter sayısı iki katına çıkar
            // garbage collection çalışmasına rağmen bir zaman sonra yeni oluşacak nesne heap e sığmaz ve hata verir
            System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));

        }


    }


}
