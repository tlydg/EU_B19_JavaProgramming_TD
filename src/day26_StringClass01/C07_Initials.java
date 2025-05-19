package day26_StringClass01;

public class C07_Initials {
    public static void main(String[] args) {
        String str = "Tülay Dag";
        //A.B.

        char ch1= str.charAt(0);
        char ch2 = str.charAt(str.indexOf(" ") + 1);


        String substring = str.substring(str.indexOf(" ") + 1);
        System.out.println("substring = " + substring); //Dag
        char ch3 =substring.charAt(0);


        System.out.println("(ch1+\".\"+ch2+\".\") = " + (ch1 + "." + ch2 + "."));

        System.out.println("(ch1+\".\"+ch3+\".\") = " + (ch1 + "." + ch3 + "."));
    }
}
