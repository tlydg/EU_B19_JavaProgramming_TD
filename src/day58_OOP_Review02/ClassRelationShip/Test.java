package day58_OOP_Review02.ClassRelationShip;

public class Test {

    public static void main(String[] args) {

        Engine engine1 = new Engine("Electric");
        Driver carDriver = new Driver("Ahmet Sürücü", "B");


        Car myCar = new Car();
        System.out.println("myCar.getEngine() = " + myCar.getEngine()); // Diesel V6
       // myCar = null; -- bilgileri sildim
       // System.out.println("myCar.getEngine() = " + myCar.getEngine()); // hata verdi.. çünkü composition

        Car mynewCar = new Car(engine1);
        System.out.println("mynewCar.getEngine() = " + mynewCar.getEngine()); //Electric
        mynewCar = null;
        System.out.println("engine1.getType() = " + engine1.getType()); // hata vermez //Electric

        Car myThirdCar = new Car(carDriver);
        Car myFourthCar = new Car(carDriver);

        System.out.println("myThirdCar.getDiriver() = " + myThirdCar.getDriver());
        myThirdCar = null;
        System.out.println("carDriver.getName() = " + carDriver.getName());


    }
}
