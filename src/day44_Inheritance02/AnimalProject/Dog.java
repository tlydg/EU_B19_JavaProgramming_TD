package day44_Inheritance02.AnimalProject;

public class Dog extends Animal {

   public Dog(){
       System.out.println("Dog a ait default cons. çalıştı");
   }

   public Dog(String sound){
       this();
       System.out.println("Dog a ait parametreli const. çalıştı : "+sound);
   }

    public Dog(String sound, int age){
        //super(sound); eger başkaca bir constr çğrılmadı ise superin default cont. vardır.
        System.out.println("Dog a ait 2 parametreli const. çalıştı : "+sound + "age :"+age);
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
