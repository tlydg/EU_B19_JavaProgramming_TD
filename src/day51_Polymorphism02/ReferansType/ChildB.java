package day51_Polymorphism02.ReferansType;

public class ChildB extends Parent implements MyInterface{
    @Override
    public void method2() {System.out.println("My interface Method 2 over Child B" );}

    public void method4(){System.out.println("Child B method4");}
}
