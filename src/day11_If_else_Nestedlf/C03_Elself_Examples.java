package day11_If_else_Nestedlf;

public class C03_Elself_Examples {

    public static void main(String[] args) {

        // ayşenin cep harçlığı 5 liradan az ise babası 10 tl versin
        // 50 liradan fazla ise babası 20 tl sini alsın
        // aksi durumda babası para vermesin

        int aysePara =60;

        if (aysePara<5){

            aysePara +=10;
        } else if (aysePara>50) {

            aysePara -=20;

        }else {

        }

        System.out.println("aysePara = " + aysePara);

        System.out.println("---------------------------------");

        /**
         * 3 adet iç açı olsun ve bunun üçgen olup olmadığını kontrol edelim.

         */

        int x, y, z;
        x =80;
        y =60;
        z=50;

        int toplam=x+y+z;

        // boolean durum = toplam ==180;

        if (toplam ==180){

            System.out.println("Bu bir üçgendir.");
        }else {

            System.out.println("Bu bir üçgen değildir.");
        }



    }
}
