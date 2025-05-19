package day42_staticMemebers;

public class C12_OuterClass {


    private static String outerStaticDegisken = "Outer statik değişkenim";

    private String outerNormalDegisken = "Outer normal değişkenim";


    public static class inner {

        void mesaj(){
            System.out.println(outerStaticDegisken);
          //  System.out.println(outerNormalDegisken);
            System.out.println("burası inner static class");
        }

    }

    public class normalInner{
        void mesaj (){
            System.out.println(outerStaticDegisken);
            System.out.println(outerNormalDegisken);
            System.out.println("Normal inner class ");
        }
    }

}

