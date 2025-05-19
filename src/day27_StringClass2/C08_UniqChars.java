package day27_StringClass2;

public class C08_UniqChars {
    public static void main(String[] args) {

        String str="AABBCD";
        String sonuc="";

        for (int i = 0; i <str.length(); i++) {
            if(str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
                sonuc+=str.charAt(i);
            }
        }
        if(sonuc.length()==0){
            System.out.println("Uniq karakter yoktur");
        }

        System.out.println(sonuc);

    }
}
