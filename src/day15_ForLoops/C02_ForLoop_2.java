package day15_ForLoops;

public class C02_ForLoop_2 {
    public static void main(String[] args) {

        // döngü sayısı i ile gösterilir ve döngü esnasında kullanılabilir.

        for (int i = 0; i <= 3 ; i++ ){
            System.out.println("i = " + i);

        }
        System.out.println("-------------------");
        // döngüyü istediğimiz noktadan başlatabiliriz.
        // 10 ila 20 arasındaki sayıları yazdıralım

        for (int i = 10; i <= 20; i++ ){
            System.out.println("i = " + i);

        }
        System.out.println("----------------");
        // 0 ile 10 arasındaki çift sayıları yazdırın

        for (int i = 0; i <= 10 ; i += 2 ){
            System.out.println("i = " + i);

        }
        // döngülerde, index değeri değiştirilmezse, sonsuz döngüye girilir.
        // i nin değeri body içinde de değiştirilebilir.

        System.out.println("----------------");

      int i ;
        for ( i = 0; i <= 10 ; i += 2 ){
            System.out.println("i = " + i);

        }
        System.out.println("for sonrası");
        System.out.println("i = " + i);


    }


}
