package day16_NestedForLoops;

public class C05_Continue {
    public static void main(String[] args) {
        /**
         * continue; // skip, atlamak --adımı atla demek
         *     - Sadece Loop icerisinde kullanılır.
         *     - continue dan sonraki kod kısmı atlanır, calistilmaz
         *
         *  break ve continue dan hemen sonra, ayni statement in icinde kod yazilamaz : Unreachable statement hatasi verir
         *
         */

        for(int i=1; i<5; i++){
            if(i==3){
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("++++++++++++++++++++++");

        for(int i=1; i<5; i++){
            if(i==3){
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("++++++++++++++++++++++");

        for(int i=1; i<20; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("++++++++++++++++++++++");

        /**
         * 1-1000 arasinda 3 e ve 5 e ortak bölünen
         *  - sayilari ekrana yazdiriniz
         *  - sayilarin adedini yazdiriniz
         */

        int count=0;
        for(int i=1; i<=1000; i++){

            // Cözüm 1
            if(i%3==0 && i%5==0){
                count++;
                System.out.println("i = " + i);
            }


            // Cözüm 2
            if(!(i%3==0 && i%5==0)){
                continue;
            }
            count++;
            System.out.println("i = " + i);


        }
        System.out.println("count = " + count);



    }
}
