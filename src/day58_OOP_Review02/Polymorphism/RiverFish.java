package day58_OOP_Review02.Polymorphism;

public class RiverFish extends Fish{

    String name = "River fish";

    String tip ;



    void water(){
        System.out.println("Tatlı su da yaşarlar ");
    }

    void beslenme(){
        System.out.println("Tatlı suda beslenirler ");
    }

    void kilcik(){
        System.out.println("Çok kılçıklı olurlar. ");
    }
}
