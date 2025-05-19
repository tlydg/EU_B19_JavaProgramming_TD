package day40_Encapsulation_02.Bank;

import java.util.ArrayList;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("TL","123",100);
        Account account2 = new Account("Pound","23456",1000);
        Account account3 = new Account("Dolar","34",1000);


        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);
        System.out.println("account3 = " + account3);

        System.out.println("account1.getTypes() = " + account1.getTypes());
        System.out.println("account1.getTypes().hashCode() = " + account1.getTypes().hashCode());

        ArrayList<String> hesapturleri = account1.getTypes();

        hesapturleri.add("Karpuz");
        hesapturleri.add("Armut");

        System.out.println("hesapturleri = " + hesapturleri);

        System.out.println("hesapturleri.hashCode() = " + hesapturleri.hashCode());
        System.out.println("account1.getTypes().hashCode() = " + account1.getTypes().hashCode());

        Account account4 = new Account("Armut","12333",1200);
        System.out.println("account4 = " + account4);


    }
}
