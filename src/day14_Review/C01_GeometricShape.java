package day14_Review;

public class C01_GeometricShape {
    public static void main(String[] args) {

        // Verilen kenar sayısından şeklin hangi
        // geometrik şekil olduğunu tespit eden bir program yazın.
        // 3-6 arası kenar sayısı kabul etsin

        int kenarSayisi = 7;
        String sekil = ""; // bu yapıyı çok kulllanacağız alış.

        if ( kenarSayisi ==3){
            sekil ="Ucgen";
        } else if (kenarSayisi == 4) {
            sekil ="Dörtgendir";
        } else if ( kenarSayisi == 5) {
            sekil ="Beşgendir";
        } else if ( kenarSayisi == 6) {
            sekil ="Altıgendir";
        }else {
            System.out.println("Belirlenmemiş şekil. ");
        }
        if (kenarSayisi >= 3 && kenarSayisi <= 6)
        System.out.println(" Bu bir " + sekil + " 'dir. ");

    }

}
