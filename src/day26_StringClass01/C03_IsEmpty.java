package day26_StringClass01;

public class C03_IsEmpty {
    public static void main(String[] args) {

        String str = "Merhaba";
        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); //false

        str="";
        System.out.println(str.isEmpty()); //true
        System.out.println(str.isBlank()); //true

        str = "  ";
        System.out.println(str.isEmpty()); //false --boşluk bile olsa kontrol eder.
        System.out.println(str.isBlank()); //true --sadece karakter arar.




    }
}
