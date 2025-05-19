package day35_ArrayList;

import java.util.ArrayList;

public class C03_Cities {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Virginia");
        cities.add("Washington");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add("Baku");

        System.out.println(cities);
        System.out.println("---------------------");

        for (String city  :cities ) {
            System.out.print(city+" ,");
        }

        System.out.println("\n---------------------");

        for (int i = 0; i <cities.size() ; i++) {
            System.out.print(cities.get(i)+ " ,");
        }

        System.out.println("\n---------------------");

        cities.remove("Baku");
        System.out.println(cities);

        System.out.println("--------------------------");

        cities.add("Hamburg");
        System.out.println(cities);

        System.out.println("---------------------");

        cities.add(0,"İstanbul");
        System.out.println(cities);

        System.out.println("---------------------");
        cities.set(cities.indexOf("Berlin"), "Munih");
        System.out.println(cities);

        // clear ();
        cities.clear();
        System.out.println(cities);

    }

}
