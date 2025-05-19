package day31_Arrays02;

public class odev1 {
    public static void main(String[] args) {

       // Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

        int [] notlar = {5,6,7,8,9,10,11};

        buyukse(notlar);

    }
    public static void buyukse(int [] arr){

        for (int i = 0; i <arr.length ; i++) {

            if(i>5){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
