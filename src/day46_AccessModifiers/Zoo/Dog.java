package day46_AccessModifiers.Zoo;

public non-sealed class Dog extends Animal {

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println("I am a dog. I can run");
    }

    @Override
    public void makeSound() {
        System.out.println("I am a dog. I make sound HAv hav");

    }

    @Override
    public String toString() {
        //return "I am a Dog " + super.toString();
        // return "I am a bird " + super.toString();
        String str = "I am a dog : \n";
        str += "\tMy name is  : " + getName() + "\n"; //super.getName()
        str += "\tMy age is   : " + getAge() + "\n"; //super.getAge()
        str += "\tMy color is : " + getColor() + "\n"; //super.getColor
        return str;
    }
}
