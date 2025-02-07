package day19_Methods1;

public class C09_DeepDeeper {
    public static void main(String[] args) {
        System.out.println("Start");
        deep();
        deep();
        deeper();
        deep();
       // C07_Amazon.amazonLogin(); istediğim yerde diğer classdaki metotları call edebilirim.
        System.out.println("Finish");
    }
    public static void deep(){
        System.out.println("Deep metodunun içi");
        deeper();
        System.out.println("Hala deep metodundayız.");
    }
    public static void deeper(){
        System.out.println("Deeper metodunun içi");
    }
}
