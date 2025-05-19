package day53_Collections_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExampleArrayList {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Green");

        System.out.println("colors = " + colors);

        colors.add(6,"Purple");

        System.out.println("colors = " + colors);

        // Indexed for ... loop
        for (int i = 0; i < colors.size() ; i++) {
            System.out.println("Element index : "+i+" - "+colors.get(i));
        }

        System.out.println();

        // Advanced for ...loop
        for (String eleman  :colors ) {
            System.out.println(eleman);
        }

        System.out.println();

        // Internal foreach
        // Lambda --> Anonymous function
        colors.forEach((eleman) ->System.out.println(eleman) );

        System.out.println();

        colors.forEach((eleman) -> {
            eleman = eleman.toUpperCase();
            System.out.println(eleman);
        });

        System.out.println("-------------------");

        // Method referance
        colors.forEach(System.out::println);  // tek tek yazdırma

        System.out.println("-------------------");


        Iterator<String> iterator = colors.iterator(); //interface

      /*  System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());

       */

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

    }
}
