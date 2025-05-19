package day44_Inheritance02.Person;

public class Person {

    // The method must have the same name as in the super/parent class
    public void introduce(){
        System.out.println("Hello I am a generic person");
    }

    public void commonTask(){
        genericMethod();
        System.out.println("Performing a common task for all people ");
    }

    private void genericMethod(){
        System.out.println("Generic method");
    }
}
