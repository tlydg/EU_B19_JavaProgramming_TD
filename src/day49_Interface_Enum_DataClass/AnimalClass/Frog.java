package day49_Interface_Enum_DataClass.AnimalClass;

public class Frog extends Animal implements Swimable,Runnable {

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Frog böcek yer");
    }

    @Override
    public void sleep() {
        System.out.println("Frog suda uyur");
    }

    @Override
    public void run() {
        System.out.println("Frog zıplıyarak koşar");
    }

    @Override
    public void swim() {
        System.out.println("frog kurbağalama yüzer");
    }

    public void printInfo() {
        System.out.println("My Name :" +getName());
        System.out.println("My Age :" +getAge());
    }
}
