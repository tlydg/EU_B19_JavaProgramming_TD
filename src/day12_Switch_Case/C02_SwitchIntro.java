package day12_Switch_Case;

public class C02_SwitchIntro {

    public static void main(String[] args) {

        int sayi = 40; // sayi 1 ile 4 arası değer alır

        // 10 -A
        // 20 -B
        // 30 -C
        // 40 -D
        // dışındaki değerler ise E dir.

        // oyunlar da ve atm de kullanılır Switch case ler.
        // switch lerde değerlerin eşitlikleri kontrol edilir büyük küçük bakılmaz.
        // break mutlaka konulmalı. bazende olmaz duruma göre.
        // default koymak zorunda değiliz.
        // double ve float olmaz çünkü ondalık sayılarda sorun yaşanıyor.
        // case 20 kısmındaki 20 olan yere sadece sabit değerler yazılır yani değişken yazılmaz.


        switch (sayi) { // byte, short, int, String, char (wrapper + Enum)
            case 10 :
                System.out.println("A");
                break;
            case 20 :
                System.out.println("B");
                break;
            case 30 :
                System.out.println("C");
                break;
            case 40 :
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }

    }
}
