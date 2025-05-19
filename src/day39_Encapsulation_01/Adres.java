package day39_Encapsulation_01;

public class Adres {

    private String street;
    private String city;
    private String country;

    public Adres(String street, String city, String country) {
        /*this.street = street;

        this.city = city;
        this.country = country;

         */
        setStreet(street);
        setCity(city);
        setCountry(country);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
          //street=street.trim();
        if(street.isBlank()){
            street="isimsiz";
        }
        this.street = street.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.isBlank()){
            city="isimsiz";
        }
        this.city = city.trim();
    }

    public String getCountry() {
        return country.toUpperCase();
    }

    public void setCountry(String country) {
        if(country.isBlank()){
            country="isimsiz";
        }
        this.country = country.trim();
    }

    @Override
    public String toString() {
       /* return "Adres{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';

        */

        return "Cadde : "+getStreet()+ " Şehir/Ülke :" +getCity() +" / "+ getCountry();
    }
}
