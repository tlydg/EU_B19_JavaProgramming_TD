package day23_Review;

public class DogTest {
    public static void main(String[] args) {


        //  Classname ObjectName = new Keyword ClassName();  --obje oluşturma yöntemi

        Dog dog = new Dog();

        System.out.println("dog = " + dog);

        dog.ad = "Karabaş";
        dog.cins = "Kangal";
        dog.renk = "Beyaz";
        dog.yas = 5;

        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);

        dog.havla();
        dog.isir();
        dog.mamaYe();
        dog.suruGut();

        dog.yas = 7; // obje üzerinden field a yeni atama yapabiliriz.

        System.out.println("dog.yas = " + dog.yas);

        // obje üzerinden eylemleri tekrar cağırabilirim.

        dog.havla();
        dog.suruGut();


        // Default değerler
        // String için Null

        Dog dog2 = new Dog();
        System.out.println("dog2.ad = " + dog2.ad);
        System.out.println("dog2.cins = " + dog2.cins);
        System.out.println("dog2.cins = " + dog2.cins);

        // int için default 0
        System.out.println("dog2.yas = " + dog2.yas);

        // boolean için default  false
        System.out.println("dog2.evcilMi = " + dog2.evcilMi);

        // char için default değer
        System.out.println("dog2.cinsiyet = " + dog2.cinsiyet);

        Dog dog3 =new Dog();
        dog3.ad ="Pamuk";
        System.out.println("dog3.ad = " + dog3.ad);

        dog3.havla();
        dog3.isir();
        dog3.mamaYe();
        dog3.suruGut();

        dog=dog3;
        System.out.println("dog.ad = " + dog.ad);
        dog.havla();
        System.out.println("dog3.ad = " + dog3.ad);
    }
}
