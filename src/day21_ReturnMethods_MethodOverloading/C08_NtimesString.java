package day21_ReturnMethods_MethodOverloading;

public class C08_NtimesString {
    public static void main(String[] args) {
        stringNtimes("Ali",5);
        System.out.println(stringTimes("Ayşe", 3));
    }
    public static void stringNtimes (String str, int num){
        for (int i = 0; i < num ; i++) {
            System.out.print(str);
        }
    }
    public static String stringTimes (String str, int num){
        String result ="";

        for (int i = 0; i < num ; i++) {
            result += str;
        }
        return result;
    }
}
