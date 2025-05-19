package day27_StringClass2;

public class Homework3 {
    public static void main(String[] args) {

        //3. soru
        //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
        //Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii


        System.out.println("tripleWord(\"Merhaba\") = " + tripleWord("Merhaba"));

        System.out.println("------------------------------");

        System.out.println("tripleWord_1(\"Ali\") = " + tripleWord_1("Ali"));


        System.out.println("------------------------------");

        String str = "Merhaba Ali";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            for (int j = 0; j <3 ; j++) {
                result+=ch;
            }
        }
        System.out.println(result);

    }
    // Metod ile
    public static String tripleWord(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
           result+=""+str.charAt(i)+str.charAt(i)+str.charAt(i);
        }
        return result;
    }
    public static String tripleWord_1(String str){
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
            String temp = str.substring(i,i+1);
           result = result.concat(temp.repeat(3));
        }
        return result;
    }

}
