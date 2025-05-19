package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_EnKucukEnBasa {
    public static void main(String[] args) {
        // en küçüğü en başa gelecek
        // diğer sayılar sıraya dizilmeyecek. (sort kullanılmayacak)

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,36,3,0,-6,-6,32,2,4,6,7));
        System.out.println("enKucukBasa(list) = " + enKucukBasa(list));
    }

    public static ArrayList<Integer> enKucukBasa(ArrayList<Integer>numbers){

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numbers.size() ; i++) {
            if(numbers.get(i) < min){
                min= numbers.get(i);
                minIndex =i;
            }
        }
        numbers.remove(minIndex);
        numbers.add(0,min);

        return numbers;


    }
}
