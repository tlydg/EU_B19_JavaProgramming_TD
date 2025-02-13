package day23_Review;

public class ModelMain {

    public static void main(String[] args) {

        MobelPhone modelIp = new MobelPhone();

        modelIp.marka="Iphone";
        modelIp.model ="15 ProMax";
        modelIp.renk ="Siyah";
        modelIp.fiyat=700.0;
        modelIp.boyut=5.1;
        modelIp.kapasite=250;
        modelIp.mesajAtabiliyorMu=true;

        System.out.println("modelIp.marka = " + modelIp.marka);
        System.out.println("modelIp.model = " + modelIp.model);
        System.out.println("modelIp.renk = " + modelIp.renk);

        modelIp.aramaYap();
        modelIp.mesajAt();
        modelIp.fotografcek();
        modelIp.interneteBaglan();

    }
}
