package day47_FinalKeyWord_VarMethodHiding.VariableHiding;

public class Test {

    public static void main(String[] args) {

        Child child = new Child();
        child.print();
        child.printParent(); // bu child class dan metod içerine super keyword ile ulaşmak
        System.out.println("child.name = " + child.name);

        Parent parent = new Parent(); // bu class dan obj üreterek ulaşmak
        parent.print();


    }
}
