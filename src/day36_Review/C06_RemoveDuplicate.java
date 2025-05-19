package day36_Review;

import java.util.ArrayList;
import java.util.Collections;

public class C06_RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("John");
        names.add("Smith");
        names.add("John");
        names.add("Smith");
        names.add("Mary");
        names.add("Jack");
        names.add("Mary");
        names.add("Smith");
        names.add("John");

        System.out.println("RemoveDuplicate(names) = " + RemoveDuplicate(names));

        System.out.println("RemoveDuplicate_1(names) = " + RemoveDuplicate_1(names));

        // System.out.println("names = " + names);

       // Collections.sort(names);
      //  System.out.println("names = " + names);


    }

    // tekrar eden isimler silinecek..
    // her isim bir kere listte kalacak
    // bu soruyu sort () kullanarak da yapınız.

    public static ArrayList<String> RemoveDuplicate(ArrayList<String> list){
        ArrayList<String> yeniList = new ArrayList<>();

        for (String name : list ) {
            if (!yeniList.contains(name)){
                yeniList.add(name);
            }

        }
        return yeniList;
    }

    public static ArrayList<String> RemoveDuplicate_1(ArrayList<String> list){
        ArrayList<String> yeniList = new ArrayList<>();

        for (String name : list ) {
            if (!yeniList.contains(name)){
                yeniList.add(name);
                Collections.sort(yeniList);
            }

        }
        return yeniList;
    }
}
