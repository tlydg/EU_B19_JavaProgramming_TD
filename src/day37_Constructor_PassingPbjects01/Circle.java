package day37_Constructor_PassingPbjects01;

public class Circle {

    // Attribute / Properties- Fields-Data member-State
    double radius; // instance variable --object e ait
    double height;


    /*
    Constructor methodların temel amacı classlardan oluşturulacak objecelerin data field,
    attribute variable alanlarına başlangıç değerlerini atamaktır

    İsmi class ismi ile aynı olmak zorundadır, return typ yoktur void dahil.
     */

    public Circle (){
        System.out.println("No args/Default constructor called");
        radius=0;
        height=0;

    }

    public Circle (double yaricap){
        System.out.println("Parameterized Constructor called");
        radius = yaricap;
    }
    public Circle (double yaricap, double yukseklik){
        System.out.println("Parameterized Constructor called");
        radius =yaricap;
        height=yukseklik;

    }

    public double getArea(){
       // return radius*radius*Math.PI;
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public void setRadius(double newRadius){
        radius=newRadius;

    }

    public double getRadius(){
        return radius;
    }

    public void setHeight(double yukseklik){
        height=yukseklik;

    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return 2*radius*Math.PI*height;
        //return getPerimeter()*height; //kontrol et
    }

    public String showInfo(){
        String str="";
        str+="Dairenin yarıçapı          :" +radius +"\n";
        str+="Dairenin yüksekliği          :" +height +"\n";
        str+="-----------------------------------\n";
        str+="Dairenin alanı         :" +getArea() +"\n";
        str+="Dairenin çevresi          :" +getPerimeter() +"\n";
        str+=" Dairenin hacmi       :" +getVolume() + "\n";
        return str;
    }




    public static void main(String[] args) {

        Circle daire1 = new Circle(); // Default constructor - No args/params const.
        System.out.println("daire1.radius = " + daire1.radius);

        daire1.radius= 12;
        System.out.println("daire1.radius = " + daire1.radius);

        Circle daire2 = new Circle(15);
        System.out.println("daire2.radius = " + daire2.radius);

        System.out.println("daire1.getArea() = " + daire1.getArea());
        System.out.println("daire2.getArea() = " + daire2.getArea());
        System.out.println("daire1.getPerimeter() = " + daire1.getPerimeter());

        daire1.radius = 125;
        System.out.println("daire1.getPerimeter() = " + daire1.getPerimeter());

        daire2.radius=100;
        System.out.println("daire2.radius = " + daire2.radius);
        System.out.println("daire2.getPerimeter() = " + daire2.getPerimeter());
        System.out.println("daire2.getArea() = " + daire2.getArea());

        daire2.setRadius(25);
        System.out.println("daire2.radius = " + daire2.radius);
        System.out.println("daire2.getArea() = " + daire2.getArea());
        System.out.println("daire2.getRadius() = " + daire2.getRadius());

        System.out.println();

        Circle daire3 = new Circle(2,3);

        System.out.println("daire3.getRadius() = " + daire3.getRadius());
        System.out.println("daire3.getHeight() = " + daire3.getHeight());
        System.out.println("daire3.getArea() = " + daire3.getArea());
        System.out.println("daire3.getPerimeter() = " + daire3.getPerimeter());
        System.out.println("daire3.getVolume() = " + daire3.getVolume());

        System.out.println("daire3.showInfo() = " + daire3.showInfo());
        System.out.println("daire1.showInfo() = " + daire1.showInfo());
        System.out.println("daire2.showInfo() = " + daire2.showInfo());


    }

}
