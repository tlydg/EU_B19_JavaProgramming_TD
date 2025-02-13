package day05_variables_cont;

public class C05_VariableTypes {

    public static void main(String[] args) {

        int i = 9/2;
        System.out.println("i = " + i); // virgülden sonrasını atar 4 yazar.

        byte b =9/2;
        System.out.println("b = " + b);  // aynı durum geçerli.

        char ch= 'A';

        String str ="Ahmet";

        char ch1 = 89;
        System.out.println("ch1 = " + ch1); // aksi tablodaki değeri Y miş onu verdi.

        char ch2 = 10+39;
        System.out.println("ch2 = " + ch2); // alt tuşu ile tablodaki karakterleri bulabilirsin.

        String name, surname;
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int x =10;
        x = x + 5;  // java önce işlemin sağ tarafına bakar.
        System.out.println("x = " + x); // x=15
        x = x + 5;
        System.out.println("x = " + x); // x =20




    }
}
