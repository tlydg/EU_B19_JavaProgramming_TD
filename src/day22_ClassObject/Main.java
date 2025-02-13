package day22_ClassObject;

public class Main {
    public static void main(String[] args) {

        int i1=6;
        int i2=4;

        Calculator calculator = new Calculator();


        System.out.println(calculator.cikartma(i1, i2));
        System.out.println(calculator.toplama(i1, i2));

        Calculator calculator1 = new Calculator();
        System.out.println("calculator1.toplama(34,23) = " + calculator1.toplama(34, 23));

        System.out.println("------------------------------------");

        Circle circle = new Circle();
        System.out.println("circle.r = " + circle.r);
        circle.r=5;
        System.out.println("circle.r = " + circle.r);
        System.out.println("circle.pi = " + circle.pi);
        circle.alanHesapla();

        System.out.println("---------------");
        circle.r=7;
        System.out.println("circle.r = " + circle.r);
        circle.alanHesapla();

        Circle circle1 = new Circle();
        circle1.r=3;

        circle1.alanHesapla();
        System.out.println("circle1.cevreHesapla() = " + circle1.cevreHesapla());

        System.out.println("---------------");
        Person tulay = new Person();
        tulay.isim="Tulay";
        tulay.yas=23;
        tulay.cinsiyet ="Kadın";
        tulay.tcNo = "12323423345";

        tulay.uyu();
        System.out.println("tulay.yas = " + tulay.yas);
        System.out.println("tulay.isim = " + tulay.isim);
        System.out.println("tulay.cinsiyet = " + tulay.cinsiyet);
        System.out.println("tulay.tcNo = " + tulay.tcNo);
        tulay.oyunOyna();

        System.out.println("---------------");
        Person ahmet = new Person();
        ahmet.isim="Ahmet";
        ahmet.yas = 25;
        ahmet.cinsiyet="Erkek";
        ahmet.tcNo="3457886333";
        ahmet.yilsonuOrtalama=79;

        ahmet.uyu();
        ahmet.oyunOyna();

        System.out.println("-----------------------");

        Car car = new Car();
        car.marka = "Audi";
        car.model = "A3";
        car.renk = "Siyah";
        car.hiz = 120.0;

        car.calistir();
        car.hizlan();
        car.dur();

        System.out.println("----------------------------------");

        Car car1 = new Car();
        car1.marka= "Volvo";
        car1.model = "Son Model";
        car1.renk = "Kırmızı";
        car1.hiz = 200.0;

        car1.calistir();
        car1.hizlan();
        car1.dur();

        System.out.println(car==car1); // false

        car=car1;

        System.out.println("car.marka = " + car.marka);



    }
}
