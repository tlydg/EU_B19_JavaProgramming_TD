package day32_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_TwoDimArrayPrint {

    public static void main(String[] args) {

        double [][] doubleNumbers= new double[5][3];

        doubleNumbers[2][2]= 8;
        doubleNumbers[3][1] = 8;

        // Çok boyutlu Arrayi deepToString ile yazdırma
        System.out.println("Arrays.deepToString(doubleNumbers) = " + Arrays.deepToString(doubleNumbers));

        // for i loop + toString ile

        for (int i = 0; i <doubleNumbers.length ; i++) {
            System.out.println("Arrays.toString(doubleNumbers["+i+"]) = " + Arrays.toString(doubleNumbers[i]));
        }

        System.out.println("----------klasik for ile--------------------------");

        for (int satir = 0; satir <doubleNumbers.length ; satir++) { // satir döngüsü
            for (int sutun = 0; sutun < doubleNumbers[satir].length ; sutun++) {
                System.out.print(doubleNumbers[satir][sutun]+"\t\t");
            }
            System.out.println();

        }

        System.out.println("----------advanced for ile (for each)-------------------------");

        // doubleNumbersı forEach ile yazdırma

        for( double [] satirDoubles: doubleNumbers){
            for ( double number : satirDoubles){
                System.out.print(number + " ");
            }
            System.out.println();
        }

        for (double [] satirDoubles : doubleNumbers){
            for (double number : satirDoubles){
               if(number == 8){
                   System.out.println("sayı bulundu");
               }
            }
            System.out.println();
        }



    }
}
