package day29_Memory_GarbageCollection;

public class C02_ProductTest {
    public static void main(String[] args) {

        C01_Product urun1=new C01_Product();
        C01_Product urun2=new C01_Product();
        C01_Product urun3=new C01_Product();
        // urun1, urun2, urun3 ---  heap memery de oluaşn nesnenin adresini/refaransın
        // barıdırıan ve stackde oluşan değişkenler


        urun1.name="Elma";  // Heap memoryde bulunur
        urun1.unitPrice=15; // Heap memoryde bulunur

        urun2.name="Elma"; // Heap memoryde bulunur
        urun2.unitPrice=15; // Heap memoryde bulunur

        urun3.name="Armut"; // Heap memoryde bulunur
        urun3.unitPrice=15; // Heap memoryde bulunur


        System.out.println("urun1 = " + urun1);
        System.out.println("urun2 = " + urun2);
        System.out.println("urun3 = " + urun3);


        System.out.println("(urun1==urun2) = " + (urun1 == urun2));

        System.out.println("urun1.name = " + urun1.name);
        System.out.println("urun3.name = " + urun3.name);


        urun1=urun3;  // urun 1 artık urun3 e ait refarnsı tutmaktadır

        System.out.println("urun1 = " + urun1);
        System.out.println("urun2 = " + urun2);
        System.out.println("urun3 = " + urun3);


        System.out.println("urun1.name = " + urun1.name);
        System.out.println("urun3.name = " + urun3.name);



    }
}
