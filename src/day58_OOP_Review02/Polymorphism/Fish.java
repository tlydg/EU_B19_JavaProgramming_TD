package day58_OOP_Review02.Polymorphism;

public class Fish extends Animals {

    String color ="Rengi belli değil";

    void hareket(){
        System.out.println("Yüzerler.");
    }

    void solunum(){
        System.out.println("Solungaç solunumu yaparlar ");
    }

    void water(){
        System.out.println("Suda yaşarlar. ");
    }
}
