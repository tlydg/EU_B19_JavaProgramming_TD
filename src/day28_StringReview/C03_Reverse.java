package day28_StringReview;

public class C03_Reverse {
    public static void main(String[] args) {

        System.out.println("reverse(\"Merhaba\") = " + reverse("Merhaba"));
        System.out.println("reverse2(\"ahmet\") = " + reverse2("ahmet"));


    }


    // verilen stringi terse çeviren metodu yazınız.

    public static String reverse(String str){
        String reversed = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverse1(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
          // reversed= reversed.concat(str.substring(i,i+1);

        }
        return reversed;

    }

    // alttaki metod çok kullanılıyor.

    public static String reverse2(String str){
        String reversed = "";
        while (!str.isEmpty()){
            String lastLetter = str.substring(str.length()-1);
            reversed +=lastLetter;
            str = str.substring(0,str.length()-1);
        }
        return reversed;

    }

}
