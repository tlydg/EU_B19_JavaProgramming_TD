package day27_StringClass2;

public class HomeWork5 {
    public static void main(String[] args) {

        System.out.println(trim("   Merhaba Dünya  "));


    }
    public static String trim(String sentece){
        int startIndex=0;
        int endIndex=0;

        for (int i = 0; i <sentece.length() ; i++) {
            if(sentece.charAt(i) != ' '){
                startIndex=i;
                break;
            }
        }
        for (int i = sentece.length()-1; i >=0 ; i--) {
            if(sentece.charAt(i) != ' '){
                endIndex=i;
                break;
            }
        }
        return sentece.substring(startIndex,endIndex+1);


    }

    //5.soru

    //trim(String str) şeklinde bir metot yazın trim gibi çalışsın
    // ve string döndürsün.  İçerisinde string in hazır metodu
    // olan trim metodunu kullanmayın.
    // "  harun merhaba nasılsın   "
}
