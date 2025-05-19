package day58_OOP_Review02.FileOps;

import day58_OOP_Review02.ClassRelationShip.Driver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String[] args)  {

        String dosya = "Dosya.txt";

        PrintWriter printWriter = null;
        Scanner scanner = null;

        try {
            printWriter = new PrintWriter(new FileOutputStream(dosya,true));

           /*
            printWriter.println("1.satır bilgileri");

            printWriter.println("2.satır bilgileri");
            printWriter.println("3.satır bilgileri");
            printWriter.println("4.satır bilgileri");

            */


            scanner = new Scanner(System.in);
            System.out.println("Dosyaya yazdırmak istediklerini yazabilirsin : ");
            String text = scanner.nextLine();

            printWriter.println(text);

            Driver driver = new Driver("ECE Alabora","E");

            String name = driver.getName();
            printWriter.println(name);




        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı...");
            e.getMessage();
        }
        finally {
            if(printWriter != null){
                printWriter.close();
            }
            scanner.close();
        }


        // txt dosyasından veri okuma
        // tamamla
        



    }
}
