package day47_FinalKeyWord_VarMethodHiding.FinalKeyword;

public final class FinalClass {

    public void Test(){
        System.out.println("Test");
        System.out.println("Math.PI = " + Math.PI);
    }
}
/*
class Child extends FinalClass {

}



class Test{
    public static void main(String[] args) {
        Child child = new Child();
        child.Test();

    }
}

 */