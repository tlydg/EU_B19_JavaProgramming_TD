package day47_FinalKeyWord_VarMethodHiding.MethodHiding;

public class Sub extends Super {

    public static boolean question(){
        return true;
    }

    public void getSubDescription(){
        System.out.println("Description :"+question());
    }
}
