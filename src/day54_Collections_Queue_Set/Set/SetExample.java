package day54_Collections_Queue_Set.Set;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        // Buradaki örnekler önemli tekrar et

        Set<Integer> myset = new HashSet<>();
        myset.add(10);
        myset.add(20);
        myset.add(30);
        myset.add(50);
        myset.add(100);
        myset.add(100);
        myset.add(100);  // duplicate kabul etmez

        System.out.println("myset = " + myset);
        System.out.println("myset.size() = " + myset.size());

        List<String> list = Arrays.asList("15","15","a","c","tt","%","c");
        System.out.println("list = " + list);

        Set<String> mySet2 = new TreeSet<>(list); // listi sete atabiliriz - duplicate veriler gider
        System.out.println("mySet2 = " + mySet2);

        System.out.println("-----------------------------------------");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(500);
        treeSet.add(100000);
        treeSet.add(5000);
        treeSet.add(10);
        treeSet.add(90534);
        treeSet.add(100);// duplicate kabul etmez


        System.out.println("treeSet = " + treeSet); // küçükten büyüğe sıralar


        System.out.println("treeSet.add(100) = " + treeSet.add(100)); // false
        System.out.println("treeSet.add(60) = " + treeSet.add(60)); // içeri de 60 yok true ve içeri ekler
        System.out.println("treeSet = " + treeSet);

        System.out.println("---------------------------------------");

        Iterator<Integer> iterator = treeSet.iterator();
        System.out.println("iterator.hasNext() = " + iterator.hasNext()); // true


        while (iterator.hasNext()){
            int num = iterator.next();
            if(num>1000){
                iterator.remove();
            }
        }
        System.out.println("treeSet = " + treeSet);


    }
}
