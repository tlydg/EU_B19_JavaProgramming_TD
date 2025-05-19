package day50_Polymorphism01.RunTime;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {

        ArrayList <Animal> hayvanlar = new ArrayList<>();

        // Animal a = new Animal("Karabaş");

        Cat cat = new Cat("Homi");
        Dog dog= new Dog("Alf");
        Duck duck =new Duck("Pamuk");

        cat.makeSound();
        dog.makeSound();
        duck.makeSound();

        cat.printName();
        dog.printName();
        duck.printName();

        System.out.println("-------------------");

        // creating polymorphic variables
        Animal animal= new Cat("PolyMorphic Cat");
        animal.makeSound(); // bu cat dekini alır
        animal.printName();
        // Child a özel metodları çağırabilmek için parent tipi downCast etmeliyiz.
        ((Cat)animal).tirmala();
        System.out.println("animal = " + animal); // farklı bir referans verir

        System.out.println("-----------------------");

        animal = new Duck("PolyMorhic Duck");
        System.out.println("animal = " + animal); // farklı referans verir
        animal.makeSound(); // bu duck dakini alır
        ((Duck)animal).fly(); // Child a özel metodları çağırabilmek için parent tipi downCast etmeliyiz.



        hayvanlar.add(cat);
        hayvanlar.add(dog);
        hayvanlar.add(duck);

        System.out.println("----------------------------------");
        System.out.println();

        for (Animal a: hayvanlar ) {
              a.printName();
              a.makeSound();
              if(a instanceof Cat){
                  ((Cat)a).tirmala();
              }
              if(a instanceof Duck){
                  ((Duck)a).fly();
              }

            System.out.println();

        }

        // Pattern matching
        /*
        Java JDK 17 ile gelen yeni bir özellik
        Patern matching enables you to remove the conversion step by changing
        the second operand of the instanceof operator with a type patern
        making your code shorter and easier to read
         */

        for (Animal h  : hayvanlar ) {
                    h.printName();
                    h.makeSound();

                    if(h instanceof Cat kedi){
                        kedi.tirmala();
                    }
                   if(h instanceof Duck ordek){
                       ordek.fly();
                   }
                   System.out.println();

        }


        // getClass() --> return full info of objects
        System.out.println("duck.getClass() = " + duck.getClass());

        // getClass().getName ----> returns the full info of object class()package name + class name

        System.out.println("duck.getClass().getName() = " + duck.getClass().getName());

        // getClass().getSimpleName() ---> returns only the objects Class name

        System.out.println("duck.getClass().getSimpleName() = " + duck.getClass().getSimpleName());

        System.out.println("-----------------------");


        for (Animal a: hayvanlar ) {
            a.printName();
            a.makeSound();
            if(a.getClass().getSimpleName().equals("Cat")){
                ((Cat)a).tirmala();
            }
            if(a.getClass().getSimpleName().equals("Duck")){
                ((Duck)a).fly();
            }

            System.out.println();

        }
    }
}
