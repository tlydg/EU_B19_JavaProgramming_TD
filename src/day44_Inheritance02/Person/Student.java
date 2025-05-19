package day44_Inheritance02.Person;

public class Student extends Person {

    //The method must have the same name as in the super/parent class
    public void introduce(){
        System.out.println("Hello, I am a student");
    }

    public void study(){
        System.out.println("Study hard for exams");
    }

}
