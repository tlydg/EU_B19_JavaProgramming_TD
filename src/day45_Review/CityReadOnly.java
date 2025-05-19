package day45_Review;

import java.util.ArrayList;

public class CityReadOnly {

    private final static ArrayList<City> cities;

    static {
        cities=new ArrayList<>();

        cities.add(new City(1,"Adana"));
        cities.add(new City(2,"Adıyaman"));
        cities.add(new City(3,"Afyon"));
        cities.add(new City(6,"Ankara"));
        cities.add(new City(16,"Bursa"));
        cities.add(new City(34,"İstanbul"));
        cities.add(new City(40,"Kırşehir"));
        cities.add(new City(71,"Kırıkkale"));
    }

    public static ArrayList<City> getCities(){
          return new ArrayList<>(cities);
          };

    public static City findByPlateNumber(int plateNumber){
        for (City city  : getCities() ) {
            if(city.getCityPlateNumber()==plateNumber) {
                return city;
            }
        }
        return new City(0,"No City Found");
    }


    public static void main(String[] args) {

        System.out.println("findByPlateNumber(3).getlFullCityName() = " + findByPlateNumber(3).getlFullCityName());

        CityReadOnly city1=new CityReadOnly();
        System.out.println(CityReadOnly.getCities().toString());


        for (City city:getCities()) {
            System.out.println(city.getlFullCityName());
        }


    }
}
