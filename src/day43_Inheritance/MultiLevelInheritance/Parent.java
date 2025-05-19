package day43_Inheritance.MultiLevelInheritance;

public class Parent extends GrantParent{

    public String lastname;

    public Parent(String name, String lastname){
        super(name);
        this.lastname = lastname;
    }

    public void display(){
        super.display();
        miras();
        System.out.println("lastname : " + lastname);
    }
}
