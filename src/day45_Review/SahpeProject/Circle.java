package day45_Review.SahpeProject;

public class Circle extends Shape{

    double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius=radius;
        System.out.println("Inside Circle constructor with color "+this.color+" and radius "+ this.radius);


    }

    public void draw(){
        System.out.println("Drawing cirle");
    }

    @Override
    public double calculateArea() {
        return Math.PI*this.radius*this.radius;
    }


    public void displayInfo(){
        System.out.println("Color : "+ super.color+" Radius : "+ this.radius);
    }
}
