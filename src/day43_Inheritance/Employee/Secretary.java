package day43_Inheritance.Employee;

public class Secretary extends Employee {

    String officeName;
    int managerId;


    public void giveReport(){
        System.out.println("Sekreter raporu sundu.");
    }

    public void createList(){
        System.out.println("Sekreter listeyi hazırladı.");
    }
}
