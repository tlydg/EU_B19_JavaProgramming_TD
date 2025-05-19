package day34_WrapperClasses;

public class C06_Example {
    public static void main(String[] args) {
        /*
        String str="Bugün hava 25 derece";
        // hava sıcaklığı 10 derece daha artarsa sıcaklık kaç derece olur?

         */

        String str="Bugün hava 25 derece";
        String[] strArr = str.split(" ");

        System.out.println(Integer.parseInt(strArr[2]) + 10); //35

        System.out.println(Integer.parseInt(str.split(" ")[2] )+ 10); //35

        int i = (int)Double.parseDouble("12.5"); // .NumberFormatException
        System.out.println(i);


    }
}
