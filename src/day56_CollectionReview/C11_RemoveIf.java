package day56_CollectionReview;

import java.util.*;

public class C11_RemoveIf {

    public static void main(String[] args) {

        List<String> counties =new ArrayList<>(Arrays.asList("Almanya","Fransa","İspanya","Avusturya"));
        System.out.println(counties);

       // counties.removeIf(x-> x.charAt(0)=='A');

        System.out.println(counties);

        System.out.println("------------------------------");

        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ali",70);
        students.put("Aliye",90);
        students.put("Fatih",65);
        students.put("Serpil",100);
        students.put("Umut",70);

        Map<String, Integer> goodStudents = new LinkedHashMap<>();


        students.forEach((k,v)->{
            if(v > 80){
                goodStudents.put(k,v);
            }
        });

        System.out.println("goodStudents = " + goodStudents);

       // students.values().removeIf(v-> v<80); // çok güzel kullanımlar hatırla bunları !!
        students.keySet().removeIf(k-> k.startsWith("A")); // çok güzel kullanımlar hatırla bunları !!

        System.out.println("students = " + students);


    }
}
