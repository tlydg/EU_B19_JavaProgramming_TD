package day27_StringClass2;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("subString(\"Merhaba\",5) = " + subString("Merhaba", 5));

    }

    public static String subString(String str, int index){
        String result = "";
        for (int i = index; i <str.length() ; i++) {
            result +=str.charAt(i);
        }
        return result;

    }


}
//4. soru
// Bir String ve bir index  numarası alan substring metodunu yazınız
// "Merhaba"     substring(str, 3)=haba
//  subString(String str,int index)