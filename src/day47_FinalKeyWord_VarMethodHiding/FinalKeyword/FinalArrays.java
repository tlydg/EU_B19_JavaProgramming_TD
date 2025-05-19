package day47_FinalKeyWord_VarMethodHiding.FinalKeyword;

public class FinalArrays {

    public static void main(String[] args) {

        int [] nums = new int[2];
        nums[0]=0;
        nums[1]=1;

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);

        nums[0]=10;
        nums[1]=11;

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);

        int [] nums2 = {30,31};

        nums = nums2;

        System.out.println("nums[0] = " + nums[0]); // 30
        System.out.println("nums[1] = " + nums[1]); // 31

        ///  ///////////////
        System.out.println();

        final int [] nums3 = {40,41};

        System.out.println("nums3[0] = " + nums3[0]); // 40
        System.out.println("nums3[1] = " + nums3[1]); // 41

        /// //////////
        System.out.println();

        nums3[0]=50; // final olsa da değerlerin değişmesine bu şekilde müsade eder
        nums3[1]=51;
        System.out.println("nums3[0] = " + nums3[0]); // 50
        System.out.println("nums3[1] = " + nums3[1]); // 51

        int [] nums4 ={60,61};

        // nums3 = nums4; // bu şekilde müsade etmez

        System.out.println("nums4[0] = " + nums4[0]);
        System.out.println("nums4[1] = " + nums4[1]);


    }
}
