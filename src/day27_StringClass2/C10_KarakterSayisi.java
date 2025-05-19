package day27_StringClass2;

public class C10_KarakterSayisi {
    public static void main(String[] args) {

        System.out.println(KarakterSay("AnkaranarRa", 'R'));
        System.out.println(karakterSay2("Ankara", 'a'));
        System.out.println(karakterSay3("ARRRRnkara", "r"));
    }

    public static int KarakterSay(String str, char ch){
        int sayac=0;
        String x=""+ch;

        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i,i+1).equalsIgnoreCase(x)){
                sayac++;
            }
        }
        return sayac;


    }
    public static int karakterSay2(String str, char ch){
        int sayac=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                sayac++;
            }
        }
        return sayac;
    }

    public static int karakterSay3(String str, String ch){

        str=str.toLowerCase();
        ch=ch.toLowerCase();

        int ilkUzunluk=str.length();
        int sonUzunluk=str.replace(ch,"").length();

        return ilkUzunluk-sonUzunluk;
    }


}
//Kullanıcıdan bir kelime ve bir karakter alın
// ve bu kelimenin istenen karakterin kaç adet olduğunu
// döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
//Ankara,a 3 Edirne,e 2