package day23_Review;

public class Main {
    public static void main(String[] args) {

        Cake cake1 = new Cake();
        cake1.kekYapan="Ahmet";
        cake1.yumurtaliMi=false;
        cake1.agirlik=1;

        Cake cake2 = new Cake();
        cake2.kekYapan="Ayşe";
        cake2.yumurtaliMi=true;
        cake2.agirlik=2;

        cake1.kekYe();
        cake1.kekYe();
        System.out.println("cake1.dilim = " + cake1.dilim);

        cake2.kekYe();
        cake2.kekYe();
        cake2.kekYe();
        cake2.kekYe();
        System.out.println("cake2.dilim = " + cake2.dilim);

        System.out.println("Cake.kekDilimi = " + Cake.kekDilimi);


    }
}
