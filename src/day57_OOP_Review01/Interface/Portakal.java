package day57_OOP_Review01.Interface;

import java.util.ArrayList;

public class Portakal implements Tagable{

    private String name;

    private static final ArrayList<Tagable> sepet = new ArrayList<>();


    public Portakal(String name) {
        this.name = name;
    }

    public static void sepetListe(){
        System.out.println("Portakal sepetindeki portakal");
        System.out.println("--------------------------");

        for (Tagable portakal : sepet){
            System.out.println(((Portakal)portakal).name);

        }
    }

    @Override
    public void select(Tagable tagableObj) {
        sepet.add(tagableObj);
    }
}
