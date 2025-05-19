package day26_StringClass01;

public class C06_ReverseString {
    public static void main(String[] args) {

        //Mülakat sorusudur.

        String str = "MERHABA";
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);

        }
        System.out.println("str = " + str);
        System.out.println("reverse = " + reverse);





    }
}
