package day17_DoWhileLoops;

public class C05_Task_2 {
    public static void main(String[] args) {

        int age =68;
        int emeklilikYasi = 67;
        int year = 2025;

        if(18<=age){
            System.out.println("Sigorta Giris izni verildi");
        }
        while (age<=emeklilikYasi){
            System.out.println();
            if (age == emeklilikYasi){
                System.out.println("Emekli oldunuz. ");
                break;
            }
            System.out.println("Yil : " + year);
            System.out.println("Sigortalinin yasi = " + age);
            System.out.println("Emekliligine kalan süre = " + (emeklilikYasi -age));
            age++;
            year++;

        }

        do {
            System.out.println();
            if (age == emeklilikYasi){
                System.out.println("Emekli oldunuz. ");
                break;
            }
            System.out.println("Yil : " + year);
            System.out.println("Sigortalinin yasi = " + age);
            System.out.println("Emekliligine kalan süre = " + (emeklilikYasi -age));
            age++;
            year++;

        } while (age<=emeklilikYasi);

        // baştan koşulu kontrol etmek gerekiyorda do- while kullanılmaz.

        int counter=1;
        boolean flag=true;
        do{
            // web Element sayfada mi?
            // if sayfada ise, flag=false
            counter++;

        } while(flag && counter<=10);

        int counter2=1;
        do{
            // web Element sayfada mi?
            // if sayfada ise, break
            counter2++;

        } while(counter2<=10);

        // WebElement i kontrol et
        // if(WebElement sayfada degil ise) {

        int counter3=1;
        while(counter3<=10){
            // web Element sayfada mi?
            // if sayfada ise, break
            counter2++;

        }

        // }

        int counter4 = 1;
        do {
            // kapi ziline bas
            counter++;
        } while(/*kapi acilana kadar zile bas*/true && counter <40);



    }
}
