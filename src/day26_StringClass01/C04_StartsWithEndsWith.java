package day26_StringClass01;

public class C04_StartsWithEndsWith {
    public static void main(String[] args) {

        // Her iki metod da boolean değer verir.

        String str = "Hersey çok güzel";
        System.out.println("(str.startsWith(\"H\")) = " + (str.startsWith("H"))); //true
        System.out.println("(str.startsWith(\"h\")) = " + (str.startsWith("h"))); //false
        System.out.println("(str.startsWith(\"Her\")) = " + (str.startsWith("Her"))); //true
        System.out.println("(str.startsWith(\"Hersey çok gü\")) = " + (str.startsWith("Hersey çok gü"))); //true
        System.out.println("(str.startsWith(\"Herseyçok gü\")) = " + (str.startsWith("Herseyçok gü"))); //false
        System.out.println("str.startsWith(\"\") = " + str.startsWith("")); //true

        System.out.println("str.endsWith(\"\") = " + str.endsWith("")); //true
        System.out.println("str.endsWith(\"l\") = " + str.endsWith("l")); //true
        System.out.println("str.endsWith(\"uzel\") = " + str.endsWith("uzel")); //false



    }
}
