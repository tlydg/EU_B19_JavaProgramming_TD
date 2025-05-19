package day56_CollectionReview;

import java.util.*;

public class C06_MapMethods {
    public static void main(String[] args) {

        // put(key, value) : Map e element ekler.
        // get(key) : Key anahtarının value değerini döner.
        // replace(key, value) : verilen key in değerini değiştirir.
        // remove(key) : Bu key e ait girdiyi siler.
        // containsKey(key) : Mapte böyle bir key varsa true döner.
        // containsValue(key) : Mapte böyle bir value varsa true döner.
        // isEmpty() : Map boş ise true döner.
        // equals(başka map) : iki map aynı ise true döner.
        // clear(): map in elementlerini siler.

        //-----------------------
        // keySet() // key. lerden oluşan bir set döner
        //values()  // valuelardan oluşan bir collection
        //entrySet() // key : value çift halinde döner


        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ali",70);
        students.put("Aliye",90);
        students.put("Fatih",65);
        students.put("Serpil",100);
        students.put("Umut",70);

        System.out.println("students.entrySet() = " + students.entrySet());


        System.out.println("students = " + students);

        System.out.println("students.keySet() = " + students.keySet());
        System.out.println("students.values() = " + students.values());
        Collection<Integer> values = students.values();
        System.out.println("values = " + values);

        List<Integer> list = new ArrayList<>(values);

        /*
        for (Integer i : values){

            list.add(i);
        }

         */
        System.out.println("list = " + list);

        System.out.println("students.get(\"Serpil\") = " + students.get("Serpil"));
        System.out.println("students.size() = " + students.size());

        students.remove("Serpil");
        System.out.println("students = " + students);

        System.out.println("students.containsKey(\"Ali\") = " + students.containsKey("Ali")); // true
        System.out.println("students.containsValue(15) = " + students.containsValue(15)); // false

        students.replace("Ali",100);
        System.out.println("students = " + students);
        students.put("Ali",99);
        System.out.println("students = " + students);





    }
}
