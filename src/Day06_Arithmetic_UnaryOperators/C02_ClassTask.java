package Day06_Arithmetic_UnaryOperators;

public class C02_ClassTask {
    public static void main(String[] args) {

        /*

       Task 1
       Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
       İfadesini bir değişkene atayın ve yıl başka bir değişken ile
       kontrol edilebilsin.

       */

        int yil=1455;
        String str="Fatih Sultan Mehmet " + yil + " yılında İstanbul u fethetmiştir."; //yili dinamik yaptık.

        System.out.println(str);

        /*
        Task 2
        Ali 1990 yılında doğmuştur. Ali kaç yaşındadır?

        Ali ile Ahmet kardeştir. Ali 1990 yılında doğmuştur. Ali ,Ahmet
        den 5 yaş büyük olduğuna göre Ahmet kaç yaşındadır.
        */

        int dogumYili=1990;
        int yasAli= 2025-dogumYili;
        System.out.println("yasAli = " + yasAli);
        System.out.println("Ali'nin yaşı "  + yasAli + " dir ");

        int yasAhmet= yasAli - 5;

        System.out.println("Ali'nin yaşı "  + yasAli + " dir ");
        System.out.println("Ahmet'in yaşı " + yasAhmet + " dir ");

        /*
         Task 3
         //300 Fahrenheit kaç Celsius ‘dur?
        // (°C=(°F-32)/1.8)
       */

        double f=300;
        double c=(f-32) /1.8;
        System.out.println(f + "Fahrenheit" +c+ "Celsius' dur");

        /*
        Task4
        Ali fizik dersinden 92,
        kimya dersinden 55,
        matematik dersinden 89 almıştır.
        Ali’nin not ortalaması kaçtır?

         */

        double aliFizik= 92;
        double aliKimya= 55;
        double aliMatemetik= 89;
        double aliOrtalama = (aliFizik + aliKimya + aliMatemetik)  / 3;

        System.out.println("aliOrtalama = " + aliOrtalama);




    }
}
