package day51_Polymorphism02.MethodCalling;

public class Instanceof {
    public static void main(String[] args) {

        Sekil sekil = new Daire();
        Sekil sekil1 = new Kare();
        Sekil sekil2 = new Ucgen();


        if (sekil instanceof Kare){
            System.out.println(sekil.alanHesapla(4));
        }
        if (sekil instanceof Ucgen){
            System.out.println(sekil.alanHesapla(4));
        }
        if (sekil instanceof Daire){
            System.out.println(sekil.alanHesapla(4));
        }
    }
}
