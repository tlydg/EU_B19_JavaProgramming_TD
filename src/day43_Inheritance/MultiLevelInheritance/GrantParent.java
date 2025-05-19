package day43_Inheritance.MultiLevelInheritance;

public class GrantParent {

    public String name;

    private int evSayisi= 10;

    public GrantParent(String name){
        this.name=name;
    }

    public void display(){
        System.out.println("name : "+ name);
    }

    public void miras(){
        System.out.println("herşeyim sizin");
    }

    public int getEvSayisi() {
        return evSayisi;
    }

    public void setEvSayisi(int evSayisi) {
        this.evSayisi = evSayisi;
    }
}
