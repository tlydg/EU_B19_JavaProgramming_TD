package day42_staticMemebers;

public class C10_AllBlocks {

    static int x;
    int y;

    public C10_AllBlocks (){
        System.out.println("Parametresiz constructor");
    }
    public C10_AllBlocks (int i){
        System.out.println("Parametreli constructor");
    }
    // Static blok önce çalışır.
    static {
        System.out.println("Static Blok-1");
        // System.out.println(y);-- erişim yoktur.
    }
    // Normal blok
    {
        System.out.println("Instance blok-1");
    }
    // Static blok önce çalışır.
    static {
        System.out.println("Static Blok-2");
    }
    // Normal blok
    {
        System.out.println("Instance blok-2");
    }

    public static void main(String[] args) {
        // static blok main metotdan bile önce çalışır.
        System.out.println("Test başladı");
        C10_AllBlocks obj1 = new C10_AllBlocks();
        C10_AllBlocks obj2 = new C10_AllBlocks(2);

    }
}
