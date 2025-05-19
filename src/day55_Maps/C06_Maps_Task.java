package day55_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_Maps_Task {
    public static void main(String[] args) {

        /**
         * String[] words = {"apple", "banana", "avocado", "orange", "banana", "apple", "banana", "cucumber"}
         *
         * Yukardaki arraydeki elemanlarin listesini tekrar eden sayilari ile yazdiniriz
         *
         * apple : 2
         * banana : 3
         * avocado : 1
         * cucumber : 1
         * orange : 1
         */

        String [] words = {"apple", "banana", "avocado", "orange", "banana", "apple", "banana", "cucumber"};
        Map<String,Integer > fruits = new HashMap<>();

        for(String fruit : words){
            // mapin içinde bu fruit varsa, value sunu arttır (Hint : containsKey())
            if(fruits.containsKey(fruit)){
                fruits.put(fruit, (fruits.get(fruit) + 1));
            } else {
                fruits.put(fruit,1);
            }
            // yoksa, map'e ekle, key : fruit , value :1

        }

        for (Map.Entry<String, Integer> entry : fruits.entrySet()){
            System.out.println("entry.getKey() = " + entry.getKey());
        }

        System.out.println("fruits = " + fruits);

    }
}
