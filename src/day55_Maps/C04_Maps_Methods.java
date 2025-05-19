package day55_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_Maps_Methods {

    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();
        // capitalCities.put(key,value);
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Turkey", "Ankara");

        // ayni key eklenmek istendiginde, var olan value yeni value ile degistirilir
        capitalCities.put("Turkey", "Istanbul");
        System.out.println("capitalCities = " + capitalCities);

        // key vererek, elementi cikarma
        capitalCities.remove("Turkey");
        System.out.println("capitalCities = " + capitalCities);

        // key ile value cagirma
        System.out.println("capitalCities.get(\"USA\") = " + capitalCities.get("USA"));

        // bu key map icerisinde tanimli ise, ekleme
        // tanimli degil ise, ekle
        // if key does not exist, returns null
        System.out.println("capitalCities.putIfAbsent(\"Turkey\", \"Ankara\") = " + capitalCities.putIfAbsent("Turkey", "Ankara"));
        System.out.println("capitalCities = " + capitalCities);
        // key var ise, return value
        System.out.println("capitalCities.putIfAbsent(\"Turkey\", \"Istanbul\") = " + capitalCities.putIfAbsent("Turkey", "Istanbul"));
        System.out.println("capitalCities = " + capitalCities);


        // if exists, returns true
        System.out.println("capitalCities.containsKey(\"Turkey\") = " + capitalCities.containsKey("Turkey")); //true
        // if does not exist, returns false
        System.out.println("capitalCities.containsKey(\"Nigeria\") = " + capitalCities.containsKey("Nigeria")); //false

        // if exists, returns true
        System.out.println("capitalCities.containsValue(\"Ankara\") = " + capitalCities.containsValue("Ankara"));
        // if does not exist, returns false
        System.out.println("capitalCities.containsValue(\"London\") = " + capitalCities.containsValue("London"));


        // to print all keys
        System.out.println("capitalCities.keySet() = " + capitalCities.keySet());
        // to print all values
        System.out.println("capitalCities.values() = " + capitalCities.values());



        // bütün elementleri cikarma
        capitalCities.clear();
        System.out.println("capitalCities = " + capitalCities);


    }
}
