package day50_Polymorphism01.RunTime;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("I am a cat and I make sound like Miyav,Miyav");
    }

    public void tirmala(){
        System.out.println("Ben bir kediyim beni kızdırırsan tırmalarım");
    }
}
