package day47_FinalKeyWord_VarMethodHiding.MethodHiding;

public class Test {

    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.getSubDescription(); // Metodlarda static yazıyor mu dikkat et,

        // Static varsa method da metodhiding oluyor.

    }


}
