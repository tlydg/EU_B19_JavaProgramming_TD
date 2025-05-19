package day57_OOP_Review01.Fabrika;

public class FirmApplication {
    public static void main(String[] args) {
        Firm firm = new Firm("ABC Mühendislik", "Sanayi caddesi No : 123");


        Person worker1 = new Worker("Ahmet worker", 35, "Production");
        Person worker2 = new Worker("Mehmet worker", 46, "Sales");
        Person worker3 = new Worker("Hatice worker", 28, "HR");


        Person teacher = new Teacher("Ali Teacher", 35);

        Person engineer = new Engineer("Suleyman Engineer", 41, "ITU");
        Person engineer2 = new Engineer("Selda Engineer", 25, "Metu");
        Person engineer3 = new Engineer("Tülay Engineer", 21, "Hacettepe");

        Person driver = new Driver("Bilal Driver", 34, "B Class");

        Person volunteer = new Volunteer("Mustafa", 18);

        firm.addWorker(worker1,worker2,worker3);
        firm.addWorker(teacher,engineer,engineer2,engineer3);
        firm.addWorker(driver,volunteer);

        System.out.println("Name of firm    : "+firm.getName());
        System.out.println("Adress of firm   : "+firm.getAdress());
        System.out.println("-----------------------------------------------");

        for (Person person : firm.getFirmWorkers()){
            System.out.println(person.showInfo());
        }

        System.out.println();

        System.out.println("Mounthly pay for all payables");
        System.out.println("--------------------------------------");

        for(Person person : firm.getFirmWorkers()){
            if (person instanceof Payable payable){
                System.out.println(payable.getClass().getSimpleName());
                System.out.println(((Person) payable).getName());
                payable.pay(1500);

            }
        }
        System.out.println();
        System.out.println("Person who can drive");
        System.out.println("--------------------------------------");
        for (Person person : firm.getFirmWorkers()){
            if (person instanceof CanDrive canDrive){
                System.out.println(((Person)canDrive).getName());
                canDrive.drive();
            }
        }

    }
}
