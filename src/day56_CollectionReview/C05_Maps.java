package day56_CollectionReview;

import com.sun.source.tree.Tree;

import java.util.*;

public class C05_Maps {

    public static void main(String[] args) {

        /*
        - Collections framework'e dahildirler.
        - Primitive data tipini desteklemezler.
        - Boyu dinamiktir
        - Key ler unique yani benzersiz olmalıdır
        - value lar duplicate olabilir
        *
        * HashMap : key ve value null olabilir; elementler random yerleşir
        * LinkedHashMap : key ve value null olabilir; elementler giriş sırasına göre yerleşir.
        * TreeMap : key null olamaz, value null olabilir; elementler küçükten büyüğe sıralanır.
        * HashTable : key ve value null olamaz; elementler random yerleşir.

        */

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10,"Ali");
        hashMap.put(20,"Ali");
        hashMap.put(30,"Ayla");
        hashMap.put(40,"Esra");
        hashMap.put(null,"Esra");
        hashMap.put(50,null);
        hashMap.put(null,null);
        hashMap.put(40,"Şeyma");

        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> LinkedHashMap = new LinkedHashMap<>();
        LinkedHashMap.put(50,null);
        LinkedHashMap.put(10,"Ali");
        LinkedHashMap.put(20,"Ali");
        LinkedHashMap.put(40,"Esra");
        LinkedHashMap.put(null,"Esra");
        LinkedHashMap.put(null,null);
        LinkedHashMap.put(40,"Şeyma");
        LinkedHashMap.put(30,"Ayla");

        System.out.println("LinkedHashMap = " + LinkedHashMap);


        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(50,null);
        treeMap.put(10,"Ali");
        treeMap.put(20,"Ali");
        treeMap.put(40,"Esra");
     //   treeMap.put(null,"Esra");
     //   treeMap.put(null,null);
        treeMap.put(40,"Şeyma");
        treeMap.put(30,"Ayla");

        System.out.println("treeMap = " + treeMap);

        Map<Integer, String> hashTable = new Hashtable<>();
       // hashTable.put(50,null);
        hashTable.put(10,"Ali");
        hashTable.put(20,"Ali");
        hashTable.put(40,"Esra");
      //  hashTable.put(null,"Esra");
        // hashTable.put(null,null);
        hashTable.put(40,"Şeyma");
        hashTable.put(30,"Ayla");
        hashTable.put(100,"Selma");
        hashTable.put(800,"Aslı");
        hashTable.put(3,"Ceren");

        System.out.println("hashTable = " + hashTable);


    }
}
