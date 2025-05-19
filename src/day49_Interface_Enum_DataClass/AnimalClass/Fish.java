package day49_Interface_Enum_DataClass.AnimalClass;

public class Fish extends Animal implements Swimable {


    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Balık küçük balıkları yer");
    }

    @Override
    public void sleep() {
        System.out.println("Balık gözü açık uyur");
    }

    @Override
    public void swim() {
        System.out.println("Balık iyi yüzer");
    }

    public void printInfo() {
        System.out.println("My Name :" +getName());
        System.out.println("My Age :" +getAge());
    }
}
