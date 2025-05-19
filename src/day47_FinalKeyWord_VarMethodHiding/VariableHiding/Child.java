package day47_FinalKeyWord_VarMethodHiding.VariableHiding;

public class Child extends Parent{

    String name = "Cild";

    public void print(){
        System.out.println(name);
    }

    public void printParent(){
        System.out.println(super.name);
    }


}
