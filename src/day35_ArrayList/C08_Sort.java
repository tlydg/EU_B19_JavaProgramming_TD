package day35_ArrayList;

import java.util.*;

public class C08_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(99,23,15,45,34,235,1,32));
        System.out.println("sayilar.size() = " + sayilar.size());
        System.out.println("sayilar = " + sayilar);

        // How to sort the list by ascending

        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // descending olarak yeni bir array e atayın

        ArrayList<Object> person = new ArrayList<>();
        person.add("Süleyman");
        person.add(1982);
        person.add(67.5);
        person.add(false);

        System.out.println(person);


    }
}
