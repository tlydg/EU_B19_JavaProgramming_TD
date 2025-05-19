package day48_AbstractClass.Vehicle;

import java.util.logging.SocketHandler;

public class OtoparkTest {

    public static void main(String[] args) {

        OtoPark otoPark = new OtoPark("Katlı Otopark","Kurtuluş,ANKARA");

        Sedan sedan = new Sedan("Mercedes","e200",2021,"Gray");
        Sedan sedan1 = new Sedan("Mercedes","e220",2024,"White");
        Sedan sedan2 = new Sedan("Mercedes","e300",2025,"Silver");

        Bus bus = new Bus("Mercedes","Maraton",2021,"Black");

        otoPark.addVehicle(sedan);
        otoPark.addVehicle(sedan1);
        otoPark.addVehicle(sedan2);
        otoPark.addVehicle(bus);

        otoPark.listOfVehicle();
        System.out.println();

    }
}
