package day51_Polymorphism02.ReferansType;

public class Test {
    public static void main(String[] args) {

        ChildA childA = new ChildA();
        childA.method1();
        childA.method2();
        childA.method3();

        System.out.println("---------------------");

        ChildB childB = new ChildB();
        childB.method1();
        childB.method2();
        childB.method4();

        System.out.println("---------------------");

        Parent childA2 = new ChildA(); // referans tipi Parent oldugundan sadece parentdaki metodlar görünür
        childA2.method1();
        ((ChildA)childA2).method3();
        ((ChildA)childA2).method2();
        //childA2.method2();

        System.out.println("-------------------------------");
        Parent childB2 = new ChildB();
        childB2.method1();

        Parent parent = new ChildA();

    }

}
