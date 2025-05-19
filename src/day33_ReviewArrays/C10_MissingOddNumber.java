package day33_ReviewArrays;

import java.util.Arrays;

public class C10_MissingOddNumber {
    public static void main(String[] args) {
        int[] nums = {9, 5, 11};
        int[] numbers = {7,9,13,15 };
        System.out.println("missingOdd(nums) = " + missingOdd(nums));
        System.out.println("missingOdd(numbers) = " + missingOdd(numbers));
    }

    // verilen bir arraydeki eksik tek sayıyı bulan metodu yazınız -> 9,7,13,15 -->11
    // verilen bir arraydeki eksik tek sayıyı bulan metodu yazınız -> 5,3,7,13,11 -->9

    public static int missingOdd(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 4) {
                return nums[i] + 2;
            }
        }
        return -1;
    }
}
