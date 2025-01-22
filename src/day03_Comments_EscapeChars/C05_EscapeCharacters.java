package day03_Comments_EscapeChars;

public class C05_EscapeCharacters {

    public static void main(String[] args) {

        System.out.println("\"Merhaba Dünya\"");

        /*
                 Common Escape Sequences (Kaçış Karakterleri)

     \b --> Önceki karakteri silmeye yarar System.out.println("testt\bmerhaba"); testmerhaba
     \t --> Tab System.out.println("testt\tmerhaba"); testt merhaba
     \r --> Satır başı yapar System.out.println("testt\rmerhaba"); merhaba
     \n --> Satır atlar System.out.println("testt\nmerhaba"); testt
                                                              merhaba
     \" --> Çift tırnak System.out.println(" \ " merhaba\" dedi."); " merhaba" dedi.
     \’ --> tek tırnak System.out.println(" \ ‘ merhaba\’ dedi."); ‘ merhaba’ dedi.
     \\ --> 1 adet ters eğik çizgi yazar.
         */


        System.out.println("One\tTwo\tThree");
        System.out.println("One\bTwo\bThree");
        System.out.println("One\nTwo\nThree");

        System.out.println("---------------");
        System.out.println("One Two\rThree");

        System.out.println("-------------------");

        System.out.println("\"One\" \"Two\" \"Three\"");
        System.out.println("One \\Two\\ Three");

    }
}


