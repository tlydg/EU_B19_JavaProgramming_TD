package day33_ReviewArrays;

import java.util.Arrays;

public class C11_EvenOdd {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 50, 60, 36, 3, 5, 6, 0};

        System.out.println("Arrays.toString(evenOdd(numbers)) = " + Arrays.toString(evenOdd(numbers)));

    }
    /*
    Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the even numbers come before all the odd numbers.
    Other than that, the numbers can be in any order.
    You may modify and return the given array, or make a new array.

        evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
        evenOdd([3, 3, 2]) → [2, 3, 3]
        evenOdd([2, 2, 2]) → [2, 2, 2]
     */

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num; // Çift sayıları başa ekliyoruz
            } else {
                result[oddIndex--] = num; // Tek sayıları sona ekliyoruz
            }
        }
        return result;
    }
}
