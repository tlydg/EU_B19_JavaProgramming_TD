package day57_OOP_Review01.Interface;

import java.util.ArrayList;

public class Elma implements Tagable{

    private String name;

    private static final ArrayList<Tagable> sepet = new ArrayList<>();


    public Elma(String name) {
        this.name = name;
    }

    public static void sepetListe(){
        System.out.println("Elma sepetindeki elmalar");
        System.out.println("--------------------------");

        for (Tagable elma : sepet){
            System.out.println(((Elma)elma).name);

        }
    }

    @Override
    public void select(Tagable tagableObj) {
        sepet.add(tagableObj);
    }
}
