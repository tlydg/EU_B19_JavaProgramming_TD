package day49_Interface_Enum_DataClass.Enumaration;

public class C04_Araba {

    private C01_Colors color;
    private C03_Brands brand;

    private int year;

    public C04_Araba(C01_Colors colors, C03_Brands brand, int year) {
        this.color = colors;
        this.brand = brand;
        this.year = year;
    }

    public C01_Colors getColors() {
        return color;
    }

    public void setColors(C01_Colors colors) {
        this.color = colors;
    }

    public C03_Brands getBrand() {
        return brand;
    }

    public void setBrand(C03_Brands brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "C04_Araba{" +
                "colors=" + color +
                ", brand=" + brand +
                ", year=" + year +
                '}';
    }
}
