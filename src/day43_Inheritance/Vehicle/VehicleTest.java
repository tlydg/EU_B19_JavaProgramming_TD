package day43_Inheritance.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.brand= "Aracın markası";
        vehicle.model = "aracın modeli";
        vehicle.start();

        Car vehicleCar = new Car();
        vehicleCar.brand ="Toyota";
        vehicleCar.model ="Avensis";
        vehicleCar.seats =5;
        vehicleCar.light = vehicleCar.turnLightOn(false);
      //  System.out.println("vehicleCar.light = " + vehicleCar.light);
        vehicleCar.weight=1500;
        vehicleCar.year=2012;
        vehicleCar.tyreSize=1400;
        vehicleCar.numberOfDoors=4;

        System.out.println("vehicleCar = " + vehicleCar);
        System.out.println("vehicle = " + vehicle);

        Plane vehiclePlane = new Plane();
        vehiclePlane.brand ="Booeing";
        vehiclePlane.model ="737";
        vehiclePlane.seats =100;
        vehiclePlane.light = vehiclePlane.turnLightOn(true);
        vehiclePlane.weight=15000;
        vehiclePlane.year=2021;
        vehiclePlane.engineType="Jet";
        vehiclePlane.propellerSize=108;

        System.out.println(vehiclePlane);

        System.out.println("--------------------------");




    }
}
