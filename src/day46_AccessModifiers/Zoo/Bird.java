package day46_AccessModifiers.Zoo;

public non-sealed class Bird extends Animal {

    public Bird() {
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println("I am a bird. And I can run with my two legs");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a bird. I make sound Cik- Cik");
    }

    public void fly(){
        System.out.println("I am a bird. I can fly");
    }

    @Override
    public String toString() {
        // return "I am a bird " + super.toString();
        String str = "I am a bird : \n";
        str += "\tMy name is  : " + getName() + "\n"; //super.getName()
        str += "\tMy age is   : " + getAge() + "\n"; //super.getAge()
        str += "\tMy color is : " + getColor() + "\n"; //super.getColor
        return str;
    }
}
