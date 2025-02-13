package day10_IfStatements;

import java.util.Scanner;

public class C04_ClassTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ders notlarını giriniz");

        System.out.print("Fizik notu giriniz: ");
        double fizik = input.nextDouble();
        System.out.print("kimya notu giriniz: ");
        double kimya = input.nextDouble();
        System.out.print("Matematik notu giriniz: ");
        double matematik = input.nextDouble();

        System.out.print("Geçme Notu: ");
        double gecmeNotu = input.nextDouble();


        double ortamala = (fizik+kimya+matematik)/3;
        System.out.println("ortamala = " + ortamala);


        if ( ortamala > gecmeNotu){
            System.out.println("Tebrikler geçtiniz");

        }else {
            System.out.println("Sınıf tekrarı gerekmektedir");
        }
        System.out.println("Program bitti.");

    }

}

/*
fizik, kimya, matematik ve geçme notlarını konsoldan alın
ortalamayı hessaplayın
geçti ise "Tebrikler geçtiniz"
kaldi ise "Ders tekrarı gerekmektedir."
        */
