package day27_StringClass2;

public class Homework2 {
    public static void main(String[] args) {

        // 2. soru
        //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve
        // yeni harfi/harfleri alan ve buna göre kelimede/dizede sadece
        // ilk bulduğu yeri değiştiren metodu yazınız.
        //(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba

        String str = "Kasaba";
        System.out.println(str.replaceFirst("a", "i"));

        System.out.println("-------------------------------------------");

        System.out.println("replaceChar(\"Merhaba\",\"a\",\"e\") = " + replaceChar("Merhaba", "a", "e"));
        //System.out.println("replaceChar1(\"kalem\",\"a\",\"i\") = " + replaceChar1("kalem", "a", "i"));

        System.out.println("replaceChar_1(\"kale\",'l','z') = " + replaceChar_1("kale", 'l', 'z'));

    }
    // Metod yazarsak

    public static String replaceChar(String str, String oldChar, String newChar){
       return str.replaceFirst(oldChar,newChar);
    }

    public static String replaceChar1(String str, char oldChar, char newChar){
        return str.replaceFirst(oldChar+"",newChar+"");
    }
    public static String replaceChar_1(String str, char oldChar, char newChar){
        String result = "";
        boolean flag =true;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==oldChar && flag){
                result+=newChar;
                flag = false;
                continue;
            }
            result+=str.charAt(i);
        }
        return result;
    }


}
