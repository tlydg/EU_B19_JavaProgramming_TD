package day45_Review.SahpeProject;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(String color, double length,double width){
        super(color);
        this.length=length;
        this.width=width;
        System.out.println("Inside Rectangle constructor with color "+this.color+ " length :"+ this.length+", width : "+ this.width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public double calculateArea() {
        return this.length*this.width;
    }

    public void displayInfo(){
        System.out.println("Color : "+ super.color+" Length : "+ this.length+", Width : "+ this.width);
    }
}
