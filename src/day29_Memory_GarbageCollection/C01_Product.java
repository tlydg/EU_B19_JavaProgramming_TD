package day29_Memory_GarbageCollection;

public class C01_Product {

    // Properties, states, fields
    // Referans değişkenler

    String name; // Heap
    double unitPrice; // Heap

    // Behavior, function, method of object ----------> STACK
    public double fiyatHesapla(int miktar){
        double fiyat= unitPrice*miktar;
        return fiyat;
    }

    public static void main(String[] args) {
        //            STACK           HEAP
        C01_Product product = new C01_Product();

        System.out.println("product = " + product);

        product.name="Elma"; // Heap memory de oluşur.
        product.unitPrice = 15; // Heap memory de oluşur.

        int miktar =3; // Local değişken stack de oluşur.

        double fiyat = product.fiyatHesapla(miktar); // Lokal değişken STACK

        System.out.println("product.name = " + product.name);
        System.out.println("product.unitPrice = " + product.unitPrice);
        System.out.println("miktar = " + miktar);
        System.out.println("fiyat = " + fiyat);


    }

}
