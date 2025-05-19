package day41_Review;

import java.util.Arrays;

public class C01_PassByValue {

    public static void main(String[] args) {

        // Primitive
        double fiyat = 200;

        System.out.println("fiyat = " + fiyat); // 200
        indirim10(fiyat); //180

        System.out.println("fiyat = " + fiyat); // 200 (orjinal değer değişmez)

        indirim10_2(fiyat); // 180
        System.out.println("fiyat = " + fiyat); // 200 yine değişmez.

        // String
        String word = "Ayşe";
        addStar(word);
        System.out.println("word = " + word); // Ayşe (yine ilk değer korunur)

        //arrayler de değişir bu durum ama koruma yöntemi var.
        int[] sayilar = {1,5,7};
        System.out.println("sayilar.toString(sayilar) = Metottan önce " + Arrays.toString(sayilar));
        onEkle(sayilar); // Sadece metot içi değişir.
        System.out.println("sayilar.toString(sayilar) = Metottan sonra " + Arrays.toString(sayilar));
        // arraydeki ilk değerler korunur.

        StringBuilder sb = new StringBuilder("Hasan");
        sb.reverse();
        System.out.println("sb = " + sb);

        String str = "Hasan";
        str.toUpperCase();
        System.out.println("str = " + str);


    }

    public static void indirim10(double fiyat){
        fiyat = fiyat * 0.9;
        System.out.println("metot içi fiyat =" +fiyat);

    }

    public static double indirim10_2(double fiyat){
        fiyat =fiyat * 0.9;
        System.out.println("metot içi fiyat =" +fiyat);
        return fiyat;

    }

    public static String addStar(String word){
        word = "***" + word + "***";
        System.out.println("metot içi word = " + word);
        return word;


    }

    public static int[] onEkle(int[] sayilar){
        int [] sayilar2 = sayilar.clone(); // Arrylerin değişmemesi için
        for (int i = 0; i < sayilar2.length ; i++) {
            sayilar2[i] +=10;
        }
        System.out.println("Arrays.toString(sayilar)-Metot içi = " + Arrays.toString(sayilar2));
        return sayilar2;

        // Testlerde bu çok kullanılır. Orjinal Listlerin bozulmaması için clone yapmak lazım.
    }


}
