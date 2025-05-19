package day49_Interface_Enum_DataClass.AnimalClass;

public interface Flyable {

    public static final int numberOfWings = 2;

    void fly();

    static void staticMethod(){
        System.out.println("Flyale statik method");
    }

    private static void staticMethodPrivate(){
        System.out.println("Flyable private statik method");
    }

    private void menzil(){
        System.out.println("menzil-1");
        System.out.println("menzil-2");
        System.out.println("menzil-3");
        System.out.println("menzil-4");
        System.out.println("menzil-5");
    }


    default void maxMenzil(){
        menzil();
        System.out.println("menzil max.");
    }

    default void minMenzil(){
        menzil();
        System.out.println("menzil min");
    }

    default void ortMenzil(){
        menzil();
        System.out.println("menzil ort");
    }



}
