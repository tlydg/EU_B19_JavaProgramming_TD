package day33_ReviewArrays;

import java.util.Arrays;

public class C07_ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 50, 60, 36, 3, 5, 6, 0};

        int[] result = reversedArray(numbers);

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

    }

    // Verilen arrayi tersine çeviren metodu yazınız.


    public static int [] reversedArray(int [] numbers){

        if(numbers.length < 2) return numbers;

        int [] reversed = new int [numbers.length];

        for (int i = numbers.length-1, k = 0 ; i >= 0 ; i--, k++) {
            reversed[k] = numbers[i];
        }
        return reversed;
    }

    // bu sorunun for each ile yapılması ödevdir.

    public static int[] reverse_2(int[] numbers) {
        if (numbers.length < 2) return numbers;
        int[] result = new int[numbers.length];
        int index = numbers.length - 1;

        for (int number : numbers){
            result[index--] = number;
        }
        return result;
    }
}
