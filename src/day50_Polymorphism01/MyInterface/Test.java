package day50_Polymorphism01.MyInterface;

public class Test {
    public static void main(String[] args) {

        //MyInterface myInterface = new MyInterface(); Interface class'ından obje oluşturulmaz.

        // Non - polymorphic way
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        // polymorphic way
        MyInterface obj1 = new ClassA();
        obj1.method();

        obj1 = new ClassB();
        obj1.method();

        System.out.println();

        MyInterface obj2 = new ClassB();
        obj2.method();

    }

}
