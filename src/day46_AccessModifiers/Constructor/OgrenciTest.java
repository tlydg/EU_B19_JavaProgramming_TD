package day46_AccessModifiers.Constructor;

public class OgrenciTest {

    public static void main(String[] args) {

        // Ogrenci ogrenci = new Ogrenci() - private constructor başka classdan direk çağrılamaz
        Ogrenci ogrenci1 = new Ogrenci("Ahmet","Çakar");
        Ogrenci ogrenci2 = new Ogrenci("Gülden", "Tazeoğlu",11);
    }
}
