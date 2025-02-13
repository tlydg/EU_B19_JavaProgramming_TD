package day22_ClassObject;

public class Math2 {

  // 1. obje oluşturmadan methodu  farklı bir  Main Class da çağırın--Static olacak
    /**
     * Math2
     *         pow methodu yazın--  pow(num1, num2)
     *             iki sayı alacak ve birinci sayı taban ikinci sayı kuvvet olacak
     *             2 üzeri 4 = 2*2*2*2
     */



   public static int pow(int x, int y){

       int result =1;
       for (int i = 0; i < y ; i++) {
           result*=x;
       }
       return result;
   }

  // 2. obje oluşturarak methodu farklı bir Main class da çağırın

    public int pow2(int x, int y){
       int result =1;
        for (int i = 0; i < y ; i++) {
            result*=x;
        }
        return result;
    }

}
