package day09_Review;

public class C06_LogicalOperatorsExample {

    public static void main(String[] args) {

        // 18 + , Turkish
        // age >=18

        String name = "Süleyman";
        int age = 34;
        String citizenship = "Turkish";

        boolean isEligibileToVote = age>=18 && citizenship.equalsIgnoreCase("turkish");
        boolean isEligibileToVote1 = age>=18 && citizenship.equals("Turkish");

        System.out.println("isEligibileToVote = " + isEligibileToVote);
        System.out.println("isEligibileToVote1 = " + isEligibileToVote1);

        System.out.println("------------------------------------");

        // findexScore >1100
       // income >=25000
      // age >=18    age <70m

        String name2 = "Selda";
        int findexScore=1300;
        int age2 = 29;
        int income = 60000;

        boolean isEligibleLoan = findexScore > 1100 && age2<70 && income>=25000 && age2 >=18;

        System.out.println(name2 + " Java Bankasından Kredi Almaya Uygun= " + isEligibleLoan);

        System.out.println("--------------------------------------------");

        String name3 = "Mike";
        int age3 = 70;
        char gender = 'E'; // Male Female

        boolean isEligibileToBuyAlcohol = age3 >=21 && (gender =='M' || gender =='F');
        System.out.println("isEligibileToBuyAlcohol = " + isEligibileToBuyAlcohol);

        System.out.println("------------------------------------------------------");


        String studentName= "Ayşe";
        double gpa = 3.6;
        int familyIncome = 65000;

        // gpa>=3.5
        // veya familyIncome <20000

        boolean isEligibileToBurs= gpa >=3.5 || familyIncome < 20000 ;
        System.out.println("isEligibileToBurs = " + isEligibileToBurs);

        System.out.println("--------------------------------------------------");

        boolean result= true;
        System.out.println("result = " + result);
        System.out.println("!result = " + !result); // False   ! tersine sonuç verir.

        System.out.println("------------------");

        int examScore = 55;
        boolean isPassed = examScore >=60 ; // false
        boolean isFailed = !isPassed;   // true

        System.out.println("isPassed = " + isPassed);
        System.out.println("isFailed = " + isFailed);
        System.out.println("!isPassed = " + !isPassed);

         /*
        Tasks: 1.

     1. Get name and age from the user, declare a variable (byte) age, write a program that can check if the
     person is eligible to buy Cigarettes. In USA it is illegal to sell tabacco under age 21.
     print console : Ahmet is eligible to buy cigarettes: true/false
    */



        /*
         * Kullanicidan aldigimiz boy ve kiloda Beden Kitle Endeksi body mass index hesaplanacak
         *   Body Mass Index (bmi) = kilo / (Boy(m)*Boy(m))
         *
         * */




    }
}
