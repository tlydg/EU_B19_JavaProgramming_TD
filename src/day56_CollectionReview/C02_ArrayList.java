package day56_CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        // Collections framework'ü içinde yer alır.
        // iç yapısında arrayleri kullanır.
        // primitive data tipini desteklemez.. wrapper classları kullanmak gerekir
        // boyu dinamiktir.
        // değer girilmezse, default değeri yoktur.
        // giriş sırası muhafaza edilir.

        ArrayList<String> adlar = new ArrayList<>(10);
        System.out.println(adlar);

        adlar.add("Ali");
        adlar.add("Aliye");
        System.out.println(adlar);

        // boyu
        System.out.println(adlar.size());
        // size bir metod


        ArrayList<String> isimler = new ArrayList<>(adlar);
        System.out.println("isimler = " + isimler);

        ArrayList<String> isimler2 = new ArrayList<>();
        isimler2.addAll(adlar);
        System.out.println("isimler2 = " + isimler2);

        ArrayList<String> isimler3 = adlar;
        System.out.println("isimler3 = " + isimler3);


        adlar.clear();


        System.out.println("isimler = " + isimler); // new keyword olduğu için silinmez
        System.out.println("isimler2 = " + isimler2); // new keyword olduğu için silinmez
        System.out.println("isimler3 = " + isimler3); // burada new keyword olmadığı için silinir.


        // Çok kullanılmıyor
        ArrayList<String> countries = new ArrayList<>(){
            {
                add("Türkiye");
                add("Almanya");
                add("İsveç");
            }
        };
        System.out.println("countries = " + countries);


        System.out.println("--------------------------------------------------");

        // Listler aşağıdaki yollarla oluşturulursa immutable olur yani yeni element eklenemez.
        List <String> list = Arrays.asList("Arif","Arife");
        List <String> list1 = List.of("Arif", "Arife");

        System.out.println("list = " + list);
        System.out.println("list1 = " + list1);

        List <String> list2 = new ArrayList<>(Arrays.asList("Arif","Arife"));
        System.out.println("list2 = " + list2);

        list2.add("Hamza");
        System.out.println("list2 = " + list2);


    }
}
