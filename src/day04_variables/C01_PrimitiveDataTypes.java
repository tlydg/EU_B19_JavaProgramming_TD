package day04_variables;

public class C01_PrimitiveDataTypes {

    public static void main(String[] args) {
        // age =48 years old
        byte myAge;  //decleration

        myAge= 48;   // assignment --atama

        System.out.println(myAge);

        myAge=55;  //  en son atanan değer gelir yani 48 değil 55 gelir.

        System.out.println(myAge);

        // weight=95
        short myWeight=95;  // decleration and assignment

        System.out.println(myWeight);

        System.out.println("-------------------");

        //Annual salary= 75000 euro

        int mySalary= 75000;
        System.out.print("My salary is :");
        System.out.println(mySalary);

        System.out.println("------------------------");

        //world population
        long worldPopulation;
        worldPopulation= 808_345_677_700L; // l veya L sona koymalıyız.

        System.out.println(worldPopulation);



    }
}
