package day56_CollectionReview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C09_List_Iterator {

    public static void main(String[] args) {

        List<String> counties = Arrays.asList("Almanya","Fransa","İspanya","Türkiye");

        ListIterator<String> listIterator = counties.listIterator();

        while (listIterator.hasNext()){
            System.out.println("listIterator.next() = " + listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println("listIterator.previous() = " + listIterator.previous());
        }




    }
}
