package day43_Inheritance.Vehicle;

public class Car extends Vehicle{

    int tyreSize;

    int numberOfDoors;

    public Car(){
        super(); // Vehicle constructor-(koymasamda java default koyuyor), ilk önce bu çalışır.
        System.out.println("car constructor");
    }

    public void honk(){
        System.out.println("Araba korna alışıyor.");
    }
    public void openTrunk(){
        System.out.println("Bagaj açıldı.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyreSize=" + tyreSize +
                ", numberOfDoors=" + numberOfDoors +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", seats=" + seats +
                ", light=" + light +
                '}';
    }
}
