package day30_Arrays01;

public class C07_ArrayLoop {
    public static void main(String[] args) {

        int [] mylist = {15,23,34,76,36,90,12};

        System.out.println("mylist[0] = " + mylist[0]);
        System.out.println("mylist[0] = " + mylist[1]);
        System.out.println("mylist[0] = " + mylist[2]);
        System.out.println("mylist[0] = " + mylist[3]);
        System.out.println("mylist[0] = " + mylist[4]);
        System.out.println("mylist[0] = " + mylist[5]);
        System.out.println("mylist[0] = " + mylist[6]);

        System.out.println("---------------------------------");

        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i]);
        }

        System.out.println("---------------------------------");
        for (int i = mylist.length-1; i >=0 ; i--) {
            System.out.println(mylist[i]);

        }
    }
}
