package day33_ReviewArrays;

public class C06_SumEvenNumbers {
    public static void main(String[] args) {

        int [] numbers ={2,3,50,60,36};

        System.out.println("SumEven(numbers) = " + SumEven(numbers));
        System.out.println("SumEven2(numbers) = " + SumEven2(numbers));
    }

    // bir arryin içindeki çift sayıları toplayıp, dönen metodu yazınız

    public static int SumEven(int [] nums ){
        int toplam = 0;
        for (int number : nums ) {
            if(number % 2 ==0){
                toplam +=number;
            }
        }
        return toplam;
    }

    public static int SumEven2(int [] nums ){
        int toplam = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 ==0) toplam += nums[i];
        }
        return toplam;
    }
}
