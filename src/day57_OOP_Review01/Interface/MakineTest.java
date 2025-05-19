package day57_OOP_Review01.Interface;

import java.util.ArrayList;

public class MakineTest {
    public static void main(String[] args) {

        Manager manager ;

        ArrayList<Tagable> meyveler = new ArrayList<>();

        meyveler.add(new Elma("Starking"));
        meyveler.add(new Armut("Ankara"));
        meyveler.add(new Elma("Golden"));
        meyveler.add(new Elma("Green"));
        meyveler.add(new Elma("Amasya"));
        meyveler.add(new Portakal("Washington"));
        meyveler.add(new Portakal("Finike"));
        meyveler.add(new Armut("Deveci"));


        for (Tagable meyve : meyveler){
            manager = new Manager(meyve);
            manager.select();
        }

        Elma.sepetListe();
        System.out.println();

        Armut.sepetListe();
        System.out.println();

        Portakal.sepetListe();


    }
}
