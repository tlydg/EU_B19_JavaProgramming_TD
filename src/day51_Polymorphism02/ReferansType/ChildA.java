package day51_Polymorphism02.ReferansType;

public class ChildA extends Parent implements MyInterface{

    @Override
    public void method2() {System.out.println("My interface Method 2 over Child A");}

    public void method3(){System.out.println("Child A method 3");}
}
