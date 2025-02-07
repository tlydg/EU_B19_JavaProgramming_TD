package day20_CustomMethods;

public class C04_PracticeTasks {
    public static void main(String[] args) {

        areaOfCircle(8);  // bunlar bir şey yazdırmaz.
        areaOfCircle(4);  // bunlar bir şey yazdırmaz.

        System.out.println(areaOfSquare(3));

        System.out.println(perimeterOfSquare(5));
        perimeterOfSquare(3);
    }
    /**
     * this method calculates the area of circle with given radius
     *
     * @param radius
     * @return
     */
    public static double areaOfCircle(int radius){
        double area;
        area = Math.PI*Math.pow(radius,2);

        return area;
    }
    /**
     * method that ca calculate the area of the square
     *
     * @param side
     * @return
     */
    public static double areaOfSquare(int side){
        return side * side; // sadece döndür yapıyoruz ifade double gelecek.
    }
    public static double perimeterOfSquare(int side){
        double cevre = 4*side;
        return cevre;
    }
}
//	create a method that can calculate the area of a circle Pi*r*r
//	create a method that can calculate the area of a square