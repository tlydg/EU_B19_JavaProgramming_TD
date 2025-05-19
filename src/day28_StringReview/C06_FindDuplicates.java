package day28_StringReview;

public class C06_FindDuplicates {
    public static void main(String[] args) {

        System.out.println(findDuplicates("yakalıklık"));
        System.out.println(findDuplicates1("kalemlik"));

    }

    //String içindeki birden fazla olan harflerden oluşan stringi dönen metodu yazınız
    //büyük küçük harf farketmez
    //yakalıklık----aklı
    //Kalkınma--- Ka

    public static String findDuplicates(String str){
        str = str.toLowerCase();
        String result= "";

        while (!str.isEmpty()){
            String firstLetter = str.substring(0,1);
            if(str.length()- str.replace(firstLetter,"").length() >1){
                result += firstLetter;

            }
            str = str.replace(firstLetter,"");
        }
        return result;
    }

    public static String findDuplicates1(String str){
        str =str.toLowerCase();
        String result= "";
        while (!str.isEmpty()){
            String firstLetter = str.substring(0,1);
            if(str.indexOf(firstLetter) != str.lastIndexOf(firstLetter)){
                result +=firstLetter;
            }
            str =str.replace(firstLetter,"");

        }
        return result;
    }
}
