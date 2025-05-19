package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_FilterRange {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(2,36,3,3,0,-6,32,2,4,6,7));

        System.out.println("filterRange(list,3,7) = " + filterRange(list, 3, 7));


    }

    public static ArrayList<Integer> filterRange(ArrayList<Integer> nums, int min, int max){
        ArrayList<Integer> sonuc =new ArrayList<>();

        for (Integer num :nums) {
            if (num>=min && num<=max ){
                sonuc.add(num);
            }

        }
        return sonuc;
    }

    // Liste içindeki rakamları verilen aralığa göre filtreleyelim.
    // list(), 3,7-> 3 ve 7 aralığı dışındakişleri silecek.(sınırlar dahil olacak)
}
