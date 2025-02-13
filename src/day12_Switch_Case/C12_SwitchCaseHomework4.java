package day12_Switch_Case;

import java.util.Scanner;

public class C12_SwitchCaseHomework4 {
    public static void main(String[] args) {

       /** Write a program that shows students English Level
        If Beginner display level=1
        If Elementary display level=2
        If Intermediate display level=3
        If Advance display level=4
        If Expert display level=5
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Write your English level : Beginner / Elementary / Intermediate /Advance / Expert");
        String level = input.nextLine();

        switch (level){
            case "Beginner", "beginner":
                System.out.println("1");
                break;
            case "Elementary", "elementary":
                System.out.println("2");
                break;
            case "Intermediate", "intermediate":
                System.out.println("3");
                break;
            case "Advance", "advance":
                System.out.println("4");
                break;
            case "Expert", "expert":
                System.out.println("5");
                break;
            default:
                System.out.println("Write a listed level! ");

        }
    }
}
