package day43_Inheritance.Employee;

public class Developer extends Employee {


    String projectName;
    String mainLang;

    String campusName = "Etlik Kampüsü"; // data hiding yaptık.


    public void releaseCode(){
        System.out.println("Kod canlıya sunuldu.");
    }

    public void assignVM(){
        System.out.println("VM olarak görevlendirildi.");
    }



}
