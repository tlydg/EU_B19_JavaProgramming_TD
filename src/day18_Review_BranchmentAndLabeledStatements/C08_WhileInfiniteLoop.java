package day18_Review_BranchmentAndLabeledStatements;

public class C08_WhileInfiniteLoop {
    public static void main(String[] args) {

        int count = 10;

        while (true){
            System.out.println("count :" +count);
            count--;

            // bunu kesmek için if ve break kullandık.

            if (count == 0){
                break;
            }
        }


    }

}
