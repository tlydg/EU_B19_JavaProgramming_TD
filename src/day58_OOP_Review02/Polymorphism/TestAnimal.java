package day58_OOP_Review02.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

    public static void main(String[] args) {

        // List<String> list = new ArrayList<>(); -- bir polymorfik yapıdır
        //  List<String> list = new List<>(); -- bu şekilde obje oluşturulmaz çünkü List interface dir.
        // ArrayList<String> list = new ArrayList<>(); -- polymorfik yapı değil.



        RiverFish riverFish = new RiverFish();
        System.out.println("riverFish.color = " + riverFish.color); // rengi belli değil
        System.out.println("riverFish.name = " + riverFish.name); // river fish
        System.out.println("riverFish.gender = " + riverFish.gender); // belirtilmemiş

        System.out.println("-----------------------------------");

        riverFish.kilcik(); // çok kılcıklıdır
        riverFish.beslenme(); // tatlı suda beslenir
        riverFish.water(); // tatlı suda yaşar
        riverFish.hareket(); // yüzerler
        riverFish.solunum(); // solungaç

        System.out.println("-----------------------------------");

        Fish fish = new RiverFish();

        System.out.println("fish.name = " + fish.name); // animals
        System.out.println("fish.color = " + fish.color); // rengi belli değil
        System.out.println("fish.gender = " + fish.gender); // belirtilmemiş

        System.out.println("-----------------------------------");

        fish.water(); // tatlı suda yaşarlar
        fish.hareket(); //yüzerler
        fish.solunum(); // solungac
        fish.beslenme(); // tatlı suda beslenirler
       // fish.kilcik(); CTE

        System.out.println("------------------------------------");

        System.out.println("(fish instanceof RiverFish) = " + (fish instanceof RiverFish)); //true
        System.out.println("(fish instanceof Fish) = " + (fish instanceof Fish)); //true
        System.out.println("(fish instanceof Animals) = " + (fish instanceof Animals)); //true

        System.out.println("riverFish instanceof RiverFish = " + (riverFish instanceof RiverFish)); //true
        System.out.println("(riverFish instanceof Fish) = " + (riverFish instanceof Fish)); //true
        System.out.println("(riverFish instanceof Animals) = " + (riverFish instanceof Animals)); //true

        System.out.println("(fish instanceof SeaFish) = " + (fish instanceof SeaFish)); // false--cont. kullanmadık
        // yani obje oluşturmadık bu yüzden false çıkıyor.



        // instanceof kullanırız

        Integer sepetUrunSayisi = 10;

        System.out.println("(sepetUrunSayisi instanceof Integer) = " + (sepetUrunSayisi instanceof Integer)); //true
        System.out.println("(sepetUrunSayisi instanceof Number) = " + (sepetUrunSayisi instanceof Number)); //true

        System.out.println("----------------------------");

        System.out.println("fish.getClass() = " + fish.getClass()); //class day58_OOP_Review02.Polymorphism.RiverFish
        System.out.println("fish.getClass().getSimpleName() = " + fish.getClass().getSimpleName()); //RiverFish
        System.out.println("fish.getClass().getName() = " + fish.getClass().getName()); //day58_OOP_Review02.Polymorphism.RiverFish

        System.out.println("------------------------");

        System.out.println("fish.getClass().getConstructors().length = " + fish.getClass().getConstructors().length);
        System.out.println("sepetUrunSayisi.getClass().getConstructors().length = " + sepetUrunSayisi.getClass().getConstructors().length);

         String str = "String";
        System.out.println("str.getClass().getConstructors().length = " + str.getClass().getConstructors().length);



    }
}
