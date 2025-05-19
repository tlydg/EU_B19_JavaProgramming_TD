package day50_Polymorphism01.RunTime;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("I am a dog and I make sound like Hav,Hav");
    }

    public void printName(){
        System.out.println("Dog class printName methodu");
        System.out.println(getName().toUpperCase());
    }
}
