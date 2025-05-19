package day56_CollectionReview;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {
        // setler duplicate veri kabul etmez.
        // setlerde veriye index ile erişim yoktur.


        Set<Integer> hashSet = new HashSet<>();
        // içine veriyi random yerleştirir.
        hashSet.addAll(Arrays.asList(100,2,0,25,-3,25,3,21,25));
        System.out.println("hashSet = " + hashSet);

        Set<Integer> LinkedHashSet = new LinkedHashSet<>();
        // içine veriyi sırayla yerleştirir.
        LinkedHashSet.addAll(Arrays.asList(100,2,0,25,-3,25,3,21,25));
        System.out.println("LinkedHashSet = " + LinkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        // içine veriyi küçükten büyüğe doğru sıralar.
        treeSet.addAll(Arrays.asList(100,2,0,25,-3,25,3,21,25));
        System.out.println("treeSet = " + treeSet);

        for ( Integer aranan : LinkedHashSet) {
            if (aranan == 25)
                System.out.println("Bulundu");
        }

        ArrayList<String> countries = new ArrayList<>(){
            {
                add("Türkiye");
                add("Türkiye");
                add("Almanya");
                add("Isveç");
            }
        };

        System.out.println("countries = " + countries);

        Set<String> countrySet = new TreeSet<>(countries);
        System.out.println("countrySet = " + countrySet);

        countrySet.add("Almanya"); // varsa.. false döner ve elementi sete eklemez
        countrySet.add("Rusya"); // yoksa.. true döner ve elementi sete ekler

        System.out.println("countrySet = " + countrySet);


    }
}
