package day16_NestedForLoops;

public class C04_Break {
    public static void main(String[] args) {
        /**
         * Break ; Kırma, bırakma, terketme
         * (atlama)
         * -- Loop ve Switch içerisinde kullanılır
         */
        for (int i=1; i<=20; i++){
            System.out.print(i + " , ");
            if (i==16){
                System.out.println("Burası Bursa burdan cikis yok!");
                break;
            }
        }
        System.out.println("-----------------------------------");

        int toplam =0;
        for (int i = 1 ; i < 100 ; i++){
            System.out.print(i + " , ");
            toplam += i;
            if (160<=toplam){
                break;
            }
        }
        System.out.println("toplam = " + toplam);

        System.out.println("-----------------------------------");

        for (int i = 1 ; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                if(i*j==16 || i*j==20){
                   break; // inner loop un sonuna atar
                }
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            } // break ---> buraya gönderir
            System.out.println();
        }
        // 1*1 =1    1*2=2  .....1*10=10
        // 2*1 =2    2*2=4  .....2*7=14   (2*8=16)
        // 3*1 =3    3*2=6  .....3*10=30
        // 4*1 =4    4*2=8  .....(4*4=16)
        // 5*1 =5    5*2 =10  .... (5*4=20)
        // ...

        System.out.println("-----------------------------------");

        hans : // label
        for (int i = 1 ; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                if(i*j==16 || i*j==20){
                    break hans; // outer loop un sonuna

                }
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        } // break hans ---> buraya gönderir.
        // 1*1=1	1*2=2	1*3=3	1*4=4	1*5=5	1*6=6	1*7=7	1*8=8	1*9=9	1*10=10
        // 2*1=2	2*2=4	2*3=6	2*4=8	2*5=10	2*6=12	2*7=14


    }
}
