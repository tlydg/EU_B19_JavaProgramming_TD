package day51_Polymorphism02.AppleDevices;

public class AppleStore {

    public static void main(String[] args) {

        AppleDevice mac = new Mac();
        mac.use();
        // mac.code(); --- referans type bu methoda ulaşmayı engelliyor
        // çünkü bu method child class tarafından override edilmemiştir.

        AppleDevice ipad = new Ipad();
        ipad.use();
        //ipad.draw()


        Ipad ipad1 = new Ipad();
        ipad1.use();
        ipad1.draw();







    }
}
