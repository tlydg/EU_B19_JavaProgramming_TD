package day22_ClassObject;

public class Car {
/*
    Fields marka, model, renk, hiz
    Methods calistir, hizlan, dur
    Javada Car class oluşturun?

            */

    public String marka;
    public String model;
    public String renk;
    public double hiz;

    public void calistir(){
        System.out.println(marka + " çalıştır");
    }
    public void hizlan(){
        System.out.println(marka+ " hizlan");

    }
    public  void dur (){
        System.out.println(marka + " dur");
    }

}
