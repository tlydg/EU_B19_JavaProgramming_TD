package day54_Collections_Queue_Set.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mavi");
        hashSet.add("Yeşil");
        hashSet.add("Gritonu");
        hashSet.add("Sarı");
        hashSet.add("Mavi"); // duplicate veri kabul etmez

        System.out.println("hashSet = " + hashSet);

        // duplicate veri kabul etmez
        // Insertion order is not preserved

        for (String each : hashSet ) {
            System.out.println("each = " + each);
        }

        // Hash koda göre sıralıyor.


    }
}
