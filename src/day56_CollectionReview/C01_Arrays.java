package day56_CollectionReview;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        /*
        - Aynı tipten birden fazla datayı depolamak için kullanılıyor.
        - index kullanılıyor
        - arraylerin boyu sabittir
        - primitive / non-primitive kullanılabilir
        - Atama yapılmadığında defult degeri vardır.

         */

        int [] numbers = {2,3,5};

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        String [] names = new String[]{"Ali","Ahmet"};
        System.out.println(names[1]);

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        System.out.println("numbers.length = " + numbers.length);

        // numbers.lenght = 5; hata verir.

        int [] nums = new int [0];

        System.out.println(Arrays.toString(firstElements(numbers, nums)));

        int nums2 [] = new int [2];  // c-type gösterim.. tercih edilmiyor ama hata vermez.

        nums2[0]=58;
        nums2[1]=5;


    }

    private static int [] firstElements(int [] sayilar1, int [] sayilar2){

        // eğer sayilar1 veya sayilar2 dizilerinden herhangi birisi boş ise
        // [-1,-1] elemanları olan bir array dönsün.

        int[] result = new int[2];
        if (sayilar1.length==0 || sayilar2.length==0){
            return new int []{-1,-1};
        }else {
            result[0] = sayilar1[0];
            result[1] = sayilar2[0];
        }
        return result;
    }
}
