package day56_CollectionReview;

import java.util.*;

public class C10_Java8_ForEachMethod {

    public static void main(String[] args) {

        List<String> counties =new ArrayList<>(Arrays.asList("Almanya","Fransa","İspanya","Avusturya"));

        counties.forEach(e -> System.out.println(e));

        counties.forEach(e -> {
            if (e.startsWith("A")){
                System.out.println(e);
            }
        });

        System.out.println("-------------------MAP-------------------");

        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ali",70);
        students.put("Aliye",90);
        students.put("Mehmet",65);
        students.put("Serpil",100);
        students.put("Umut",70);

        students.forEach((k,v)-> System.out.println(k+" --> "+v));

        System.out.println("-----------------------------------");

        students.forEach((k,v)->{
            if(k.substring(k.length()-1).equals("t")){
                System.out.println(k + " --> " +v);
            }
        });







    }
}
