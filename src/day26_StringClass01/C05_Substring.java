package day26_StringClass01;

public class C05_Substring {
    public static void main(String[] args) {

        String str = "Merhaba Dünya Hava çok Güzel";
        //            0123456789012345678901234567

        System.out.println("str.length() = " + str.length()); // 28

        System.out.println("str.substring(12) = " + str.substring(12));// 12. index dahil
        //a Hava çok Güzel
        System.out.println("str.substring(12,23) = " + str.substring(12, 25)); // 12.index dahil ama 25.index dahil DEĞİL
        //a Hava çok Gü

        System.out.println("str.substring(23) = " + str.substring(23)); //Güzel
        System.out.println("str.substring(str.length()-5) = " + str.substring(str.length() - 5)); //Güzel
        System.out.println("str.substring(str.length()-3) = " + str.substring(str.length() - 3)); //zel

        System.out.println("str.substring(27) = " + str.substring(27, 28)); // l

        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1)); //l
        System.out.println("str.substring(str.length()-1,str.length()) = " + str.substring(str.length() - 1, str.length()));
        //l


        System.out.println("str.substring(0,1) = " + str.substring(0, 1)); //M
      //System.out.println("str.substring(5,3) = " + str.substring(5, 3)); // StringIndexOutOfBoundsException --runtime Error







    }
}
