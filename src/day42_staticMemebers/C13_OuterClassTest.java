package day42_staticMemebers;

public class C13_OuterClassTest {
    public static void main(String[] args) {

        C12_OuterClass.inner innerObje = new C12_OuterClass.inner();
        innerObje.mesaj();

        System.out.println("-----------------------------");

        C12_OuterClass outerClass   = new C12_OuterClass();
        C12_OuterClass.normalInner normalInner = outerClass.new normalInner();
        normalInner.mesaj();


    }
}
