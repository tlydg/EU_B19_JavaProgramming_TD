package day49_Interface_Enum_DataClass.DataClass;

public class C02_PersonTest {

    public static void main(String[] args) {

        C01_Person person = new C01_Person("Ali","Akyaka","507704410","Bala/Ankara");

        System.out.println("person.getFirstName() = " + person.getFirstName());

        // person.firstName = "Zahid" yapamam hem private hem final

        System.out.println(person);

        C03_PersonRecord personRecord = new C03_PersonRecord("Ayşe","Güz","6542527","Çankaya/ankara");
        System.out.println("personRecord.firstName() = " + personRecord.firstName());
        System.out.println(personRecord);

        personRecord.printAddress();
        System.out.println("personRecord.address() = " + personRecord.address());

        System.out.println("personRecord.generateCode() = " + personRecord.generateCode());


    }
}
