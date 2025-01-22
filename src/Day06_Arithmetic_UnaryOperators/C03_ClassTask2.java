package Day06_Arithmetic_UnaryOperators;

public class C03_ClassTask2 {

    public static void main(String[] args) {

        /*

        int i=11;
        int j=3;
        int k=i/j;  // 3.56 --- int değer küsüratı atar direk 3 verir.

        System.out.println("k = " + k);

         */


        // 4500 dakika kaç saat eder?

        int dk=4500;
        int saat =dk/60;
        int kalanDK = dk%60;

        System.out.println(dk+ "dakika " + saat+ " saat " +kalanDK+"  dakikadır");


        //31502 saniye kaç saat kaç dakika kaç saniyedir?
        // (1 saat 60 dakika 1 dakika 60 sn)

        int totalSecond= 31502;
        int hour= totalSecond/3600;
        int min =totalSecond%3600/60;
        int second = totalSecond%60;
        System.out.println(totalSecond+ " saniye " + hour + " saat " + min + " dakika " + second + " saniyedir." );







        





    }



}
