package day47_FinalKeyWord_VarMethodHiding.FinalKeyword;

public class FinalMethods {

    public final void method1(){
        System.out.println("Super class Method-1");
    }
}

class Sub extends FinalMethods {
/*
    @Override
    public void method1() {
        System.out.println("Sub class Method-1");
    }

 */
}

class Main{

    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.method1();
    }
}