package day50_Polymorphism01.RunTime;

public class Duck extends Animal {


    public Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("I am a cat and I make sound like Vak,Vak");
    }

    public void printName(){
        System.out.println("Duck class printName methodu");
        System.out.println(getName().toUpperCase());
    }

    public void fly(){
        System.out.println(" I am a duck and I fly ");
    }
}
