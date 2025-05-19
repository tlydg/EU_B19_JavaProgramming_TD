package day46_AccessModifiers.Singleton;

public class Single {

    // bunu otomasyonda kullancaz, yani driver da kullanıyoruz.

    private static Single singleInstance=null; //Metod ile oluşturulan instance ı tutan değişken
    private static int maxNumberOfInstance; //Oluşturulabilecek maksimum instance sayısı
    private static int numberOfInstance; // Oluşturulan instance sayısı


    public Single() { //Oluşturulan instance sayısı
        numberOfInstance++;
    }
    //Constructor lar private tanımlandığından ancak bu metod ile instance oluşturulabilir.
    public static Single getInstance(){
        System.out.println("GetInstance Method Called");
        if (singleInstance == null || numberOfInstance<maxNumberOfInstance){
            System.out.println("Instance created");
            singleInstance = new Single();
        }

        return singleInstance;

    }

    public static void setMaxInstance (int instance){
        maxNumberOfInstance= instance;
    }

    public int getMaxNumberOfInstance(){
        return maxNumberOfInstance;
    }



}
