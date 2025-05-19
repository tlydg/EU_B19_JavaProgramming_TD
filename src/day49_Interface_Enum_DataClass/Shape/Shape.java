package day49_Interface_Enum_DataClass.Shape;

public interface Shape {

    //Interface içindeki propertiler (variables, fields, data members)
    // default olarak public static final olurlar.

    // constr burada olmaz

    public static final double PI = 3.14; // bütün variables psf şeklindedir

    public abstract double perimeter (); // zaten bütün metodlar abstract

    double area();

    default void threeDPrinter(){
        System.out.println("3 boyutlu klaslar içindir");
    };


    default void displayInfo(){
        System.out.println("I am shape interface");
    }

    static void staticMethod(){
        System.out.println("I am a static method from Shape interface");
    }

    // static metod overread edilemiyor.

}
