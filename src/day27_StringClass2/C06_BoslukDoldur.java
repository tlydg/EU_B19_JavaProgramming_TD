package day27_StringClass2;

public class C06_BoslukDoldur {
    public static void main(String[] args) {
         //Kullanıcıdan bir dize sözcük alın ve her
        //boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
        // "   merhaba dünya  "   %%%merhaba%dünya%%

        String str = "  Merhaba Dünya  ";
        str=str.replace(" ","%");
        System.out.println("str = " + str);
        System.out.println("--------------------------");

        System.out.println(boslukDoldur("     Kimsein Sen    "));


    }
    public static String boslukDoldur(String str){

       return str.replace(" ", "%");
    }

}
