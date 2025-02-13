package day22_ClassObject;

public class MainPow {
    public static void main(String[] args) {

        System.out.println(Math2.pow(5, 2));

        Math2 obj = new Math2(); // Metod içerisinde static kullanmıyoruz.
        System.out.println(obj.pow2(2, 3));
    }
}
