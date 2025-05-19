package day37_Constructor_PassingPbjects01;

public class Musteri {

    String name;
    int hesapNo;
    String phone;
    double bakiye;

    public Musteri() {

    }
    public Musteri(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public double getBakiye(){
        return this.bakiye;
    }

    public void showInfo(){
        System.out.println("********Müşteri Bilgileri********");
        System.out.println("Müşterinin adı     :"+name);
        System.out.println("Müşterinin telefonu    :"+phone);
        System.out.println("Müşterinin hesap No    :"+hesapNo);
        System.out.println("Müşterinin bakiyesi   :"+bakiye);
    }

}
