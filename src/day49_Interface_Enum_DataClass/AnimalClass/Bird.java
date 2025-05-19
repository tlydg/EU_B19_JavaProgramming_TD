package day49_Interface_Enum_DataClass.AnimalClass;

public class Bird extends Animal implements Flyable,Swimable,Runnable {


    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " yem yer");
    }

    @Override
    public void sleep() {
        System.out.println("Kuş ağaçta uyur");
    }

    @Override
    public void printInfo() {
        System.out.println("My Name :" +getName());
        System.out.println("My Age :" +getAge());
    }

    @Override
    public void swim() {
        System.out.println("Kuş yüzebilir");
    }

    @Override
    public void fly() {
        System.out.println("Kuş kanatlarıyla uçar");
    }

    @Override
    public void run() {
        System.out.println("Kuş iki ayağı ile koşar");
        System.out.println("My Name   :" +getName());
        System.out.println("My Name   :" +getName());
    }
}


