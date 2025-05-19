package day44_Inheritance02.Person;

public class PersonTest {

    public static void main(String[] args) {

        Person person= new Person();
        person.introduce();
        person.commonTask();


        Student student= new Student();
        student.introduce(); // method overriding / specific implementation for child class
        student.commonTask(); // method inherited from parent class
        student.study(); // method in  child class


    }


}
