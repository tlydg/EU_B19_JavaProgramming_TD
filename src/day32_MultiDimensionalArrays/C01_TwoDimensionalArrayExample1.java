package day32_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_TwoDimensionalArrayExample1 {

    public static void main(String[] args) {

        // Genelde 2 boyutlu Arry kullanacağız.

        System.out.println("Two dimensional arrays in Java");

        int [][] numbers = new int [3][3] ; // 3 satır ve 3 sütun 3*3=9 elemanlıdır

                // 0.ST 1.ST 2.ST
        // 0.satır 0    0    0
        // 1.satır 0    0    0
        // 2.satır 0    0    0

        numbers [0][0]=1;
        numbers [0][1]=5;
        numbers [0][2]=17;

        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));


        int [] birArray = {19,0,-16};
        numbers[1]= birArray;
        numbers[2] = new int []{2,30,-99};

        System.out.println("Arrays.deepToString(numbers) = " + Arrays.deepToString(numbers));

        // literal way ile two dim array oluşturma

        String [][] names ={
                {"Ali","Ahmet"},
                {"Elif","Eylül"},
                {"Burak","Hande"},
        };

        System.out.println("names[1][1] = " + names[1][1]); //Eylül

        System.out.println("names.length = " + names.length); // 3 yani satır sayısı

        //herhangi bir satırdaki eleman sayısı nasıl yazdırılır?
        System.out.println("names[0].length = " + names[0].length); // 2 eleman var
        System.out.println("names[1].length = " + names[1].length); // 2 eleman var


    }
}
