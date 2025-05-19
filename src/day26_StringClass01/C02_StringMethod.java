package day26_StringClass01;

public class C02_StringMethod {
    public static void main(String[] args) {

        String programlamaDili = "Java"; // Heap -- String Pool içerisinde bir obje oluştur.

        System.out.println("programlamaDili.length() = " + programlamaDili.length()); //4

        programlamaDili = "Phyton";
        System.out.println("programlamaDili.length() = " + programlamaDili.length()); //6

        System.out.println("------------------------");

        // toLowerCase()(küçük harfe çeviriyor) and toUpperCase()(Büyük harfe çeviriyor)
        System.out.println("programlamaDili.toLowerCase() = " + programlamaDili.toLowerCase());
        System.out.println("programlamaDili.toUpperCase() = " + programlamaDili.toUpperCase());
        System.out.println("programlamaDili = " + programlamaDili);

        programlamaDili= programlamaDili.toUpperCase(); // Bu değişkeni komple değiştirir.
        System.out.println("programlamaDili = " + programlamaDili);

        System.out.println("-------------------------------------------");

        //charAt() // PHYTON
        //            012345  --bunlar index

        System.out.println("programlamaDili.charAt(1) = " + programlamaDili.charAt(1)); // H
        System.out.println("programlamaDili.charAt(1) = " + programlamaDili.charAt(5)); // N

        System.out.println("programlamaDili.charAt(programlamaDili.length() -1) = " + programlamaDili.charAt(programlamaDili.length() - 1));
        //İndex numarası vermeden son karakteri bulduk.

        programlamaDili="Phyton Programming";
        System.out.println("programlamaDili.length() = " + programlamaDili.length());
        System.out.println("programlamaDili.charAt(6) = " + programlamaDili.charAt(6));

        programlamaDili = "PHYTON";
       // System.out.println("programlamaDili.charAt(-1) = " + programlamaDili.charAt(-1)); --Hata verir.
        //.StringIndexOutOfBoundsException

        System.out.println("--------------------------------");

        // concat () --birleştirme
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println(programlamaDili + " Programlama Dili");
        System.out.println("programlamaDili.concat(\" Programlama Dili\") = " + programlamaDili.concat(" Programlama Dili"));
        String dil = " Programlama Dili";
        System.out.println("programlamaDili.concat(dil) = " + programlamaDili.concat(dil));

        System.out.println("-----------------------------------");

        // PHYTON
        // contains() ---boolean değer döndürür.
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.contains(\"HY\") = " + programlamaDili.contains("HY"));
        System.out.println("programlamaDili.contains(\"YH\") = " + programlamaDili.contains("YH"));
        System.out.println("programlamaDili.contains(\"hy\") = " + programlamaDili.contains("hy"));

        programlamaDili= "    Phyton Programlama Dili     ";
        System.out.println("programlamaDili.contains(\"phyton\") = " + programlamaDili.contains("phyton"));
        System.out.println("programlamaDili.contains(\"n Prog\") = " + programlamaDili.contains("n Prog"));

        System.out.println("---------------------------------");

        // trim() -- baştaki ve sondaki boşlukları atar. Ortadakilere dokunmaz.
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.trim() = " + programlamaDili.trim());
        System.out.println("programlamaDili = " + programlamaDili);

        System.out.println("programlamaDili.charAt(programlamaDili.length() -1) = " + programlamaDili.charAt(programlamaDili.length() - 1));
        //sonda boşluk olduğu için karakteri bulamam önce trim yapmam lazım karakteri bulmak için.

        System.out.println("----------------------------------------------------");

        // replace () -değiştir--karakterleri değiştiririz.
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.replace(\" \",\"\") = " + programlamaDili.replace(" ", ""));
        System.out.println("programlamaDili.replace(\"P\",\"a\") = " + programlamaDili.replace("P", "a"));

        programlamaDili= programlamaDili.replace(" ", "");
        System.out.println("programlamaDili = " + programlamaDili);

        System.out.println("programlamaDili.replace(\"Phyton\",\"Java\") = " + programlamaDili.replace("Phyton", "Java"));

        System.out.println("---------------------------------------------------------");

        // indexOf()(ilk index numarası) , lastIndexOf()(son biten index numarası)
        // PhytonProgramlamaDili
        System.out.println("programlamaDili = " + programlamaDili);
        System.out.println("programlamaDili.indexOf('a') = " + programlamaDili.indexOf('a'));
        System.out.println("programlamaDili.indexOf(\"Programlama\") = " + programlamaDili.indexOf("Programlama"));
        System.out.println("programlamaDili.lastIndexOf(\"a\") = " + programlamaDili.lastIndexOf("a"));

        System.out.println("programlamaDili.indexOf(programlamaDili.charAt(programlamaDili.length()/2)) = " + programlamaDili.indexOf(programlamaDili.charAt(programlamaDili.length() / 2)));


        System.out.println("--------------------------------------------------------");

        // equals()
        String str1="hello";
        String str2="hello";
        String str3=new String("Hello");
        String str4=new String("HELLO");

        System.out.println((str1 == str2));  //true
        System.out.println((str1.equals(str2))); //true
        System.out.println((str1.equals(str3))); //false
        System.out.println((str1.equals(str4)));// false

        System.out.println("-------------------------------");

        // equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str1.toLowerCase().equals(str4.toLowerCase()));
        //metodları iç içe kullanabiliriz




    }
}
