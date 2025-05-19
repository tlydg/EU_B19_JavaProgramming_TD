package day43_Inheritance.Vehicle;

public class Vehicle {
    String brand;
    String model;
    int year;
    double weight;
    int seats;
    boolean light;

    public Vehicle(){
        System.out.println("vehicle constructor");
    }

    public void start(){
        System.out.println("Araç çalıştı.");

    }
    public void stop(){
        System.out.println("Araç durdu.");
    }
    public void move(){
        System.out.println("Araç hareket ediyor");
    }
    public  boolean turnLightOn(boolean dayTime){
        if(!dayTime){
            light = true;
            return light;
        }else {
            return light;
        }

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
