package day52_Errors_Exceptions;

public class C02_OutOfMemory {


    public static void main(String[] args) {

        String str = "Merhaba Java";

        System.out.println(str);

        int sayac=0;

        while (sayac<30){
            System.out.println(sayac);
            sayac++;
            try {
                str += str;                     // Hatanın kaynaklandığı kod parçası
            }catch (OutOfMemoryError e ){       // yakalanmasını beklediğimiz hata türü
                System.out.println("Bir hata oluştu!!!");
                System.out.println("Hata :"+e.getMessage()); // Hatanın kaynağını belirten hata mesajını yazdırır
            }catch (Error e ){
                e.printStackTrace();          // Hatanın takibini yapmak için gerekli olan konsol çıktılarını yazdırır

            }

            System.out.println("Program sona erdi"); // bu şekilde kod devam ediyor çalışmaya
        }


    }

}
