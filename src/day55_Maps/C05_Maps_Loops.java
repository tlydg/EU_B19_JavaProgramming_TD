package day55_Maps;

import java.util.*;

public class C05_Maps_Loops {

    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();
        // capitalCities.put(key,value);
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Turkey", "Ankara");

        // key leri yazdiralim
        // metod 1
        System.out.println("capitalCities.keySet() = " + capitalCities.keySet());

        // method 2
        Set<String> countries = capitalCities.keySet();
        for(String country : countries){
            System.out.println("country = " + country);
        }
        for (String country : capitalCities.keySet()){
            System.out.println("country = " + country);
        }


        // value lari yazdiralim
        // method 1
        System.out.println("capitalCities.values() = " + capitalCities.values());

        // method2
        Collection<String> capitals = capitalCities.values();
        for(String capitalCity : capitals){
            System.out.println("capitalCity = " + capitalCity);
        }

        for(String capitalCity : capitalCities.values()){
            System.out.println("capitalCity = " + capitalCity);
        }

        //
        for (Map.Entry<String, String> entry : capitalCities.entrySet()){
            // entry = ("Norway", "Oslo")
            System.out.println("entry.getKey() = " + entry.getKey()); // Norway, USA, Germany,Turkey
            System.out.println("entry.getValue() = " + entry.getValue()); // Oslo, Washington DC, Berlin, Ankara
        }







    }
}
