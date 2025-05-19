package day58_OOP_Review02.Polymorphism;

public class SeaFish extends Fish {

    String name;

    String tip;

    String color;


    void water(){
        System.out.println("Tuzlu suda yaşarlar. ");
    }

    void beslenme(){
        System.out.println("tuzlu suda beslenirler. ");
    }

    void kilcik(){
        System.out.println("Az kilçikli olurlar. ");
    }
}
