package Day13_Ternary;

public class C02_AdvancedSwitchCase {

    public static void main(String[] args) {

        int level = 2;
        String levelStr;

       levelStr = switch (level){
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            default -> "hatalı giriş";
       };
       System.out.println("levelStr = " + levelStr);

       // switch işlemi sonucunda oluşan değer bir variable atanmak isteniyorsa
        // bütün caselerin sonucunda oluşan değer ile atanacak variable'ın data tipi aynı olmalıdır.

       switch (level){
            case 1 -> levelStr = "A";
            case 2 -> System.out.println("B");
            case 3 -> System.out.println(22);
            default -> System.out.println("Hatalı giriş");

       };
    }
}
