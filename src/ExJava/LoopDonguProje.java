package ExJava;

public class LoopDonguProje {
    public static void main(String[] args) {

        // Proje
        // "Hello World!" yazimiz mevcut
        // Bu yazı icerisindeki 'o' ları 0 ile degistir

        String hello = "Hello World!";
        int stringUzunlugu = hello.length();
        int index=0;
        String yeniString = "";
        while (index < stringUzunlugu){
            char bulunanKarakter = hello.charAt(index);
            if(bulunanKarakter == 'o'){
                yeniString = yeniString + 0;

            }else{
                yeniString = yeniString + bulunanKarakter;

            }
            index++;

        }
        System.out.println(yeniString);
    }
}
