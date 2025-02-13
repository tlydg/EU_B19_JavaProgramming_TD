package day15_ForLoops;

public class C01_ForLoop_1 {
    public static void main(String[] args) {

        // 5 kere "Hello World" yazdırın...

        // old way
        String message = "Hello World";
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

        System.out.println("----------------------------");

        // new way with loop

        for (int i =0 ; i<5 ; i++) {
            System.out.println(message);
            // bu şekilde sabitse statiktir, yani sadece hello word yazdırıyoruz.

        }
        // bir değişken sadece body içinde tanımlıysa localdir.
        // ama bodynin dışında tanımlandıysa globaldir.
    }

}
