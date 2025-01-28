package day15_ForLoops;

public class C05_TekCiftToplam {

    public static void main(String[] args) {

        // 1 den 100 e kadar olan tek ve çift sayıların
        // ayrı ayrı toplamı kaçtır.

        int tek= 0;
        int cift= 0;

        for (int i = 1; i <=100 ; i++ ){

            if(i %2 == 0 ){
                cift += i;
            }else {
                tek += i;
            }
        }
        System.out.println("cift = " + cift);
        System.out.println("tek = " + tek);

        System.out.println("---------------------------");

        //ternary boolean ? true : false; // bu kod performansına önem verir

        int tekSayilar= 0;
        int ciftSayilar= 0;

        for (int i = 1; i <=100 ; i++ ){

          ciftSayilar +=  (i % 2 ==0) ? i : 0;
          tekSayilar +=  (i % 2 == 1) ? i : 0;

        }
        System.out.println("ciftSayilar = " + ciftSayilar);
        System.out.println("tekSayilar = " + tekSayilar);
    }
}
