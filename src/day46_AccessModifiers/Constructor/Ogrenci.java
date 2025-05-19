package day46_AccessModifiers.Constructor;

public class Ogrenci {

    private String name; // private---class special--- any other members of same class can access
    private String lastname; // private---class special--- any other members of same class can access
    private int number; // private---class special--- any other members of same class can access

    public Ogrenci() {
        System.out.println("Private const. called");
    }
    //Bu constructor Protected tanımlandığından ancak miras ilişkisi kurulduktan sonra bu constructor ile instance oluşturulabilir
    protected Ogrenci(String name, String lastname) {
        this();
        this.name = name;
        this.lastname = lastname;
    }

    public Ogrenci(String name, String lastname, int number) {
      //  this(name,lastname);
        this.name = name;
        this.lastname = lastname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
