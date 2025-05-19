package day35_ArrayList;

import java.util.ArrayList;

public class C05_Contains {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");
        // list1.add(3); ---- içerisine veri tipini doğru olarak girmeliyiz

        System.out.println(list1);

        ArrayList<String>list2 = list1;
        System.out.println(list2);

        ArrayList<String> month = new ArrayList<>(list1);
        System.out.println(month);

        list1.add("Jun");
        System.out.println(list1);

        // Feb indexinin 1 olduğunu nasıl check ederim ?

        System.out.println(month.indexOf("Feb") == 1);
        System.out.println(month.get(1).equals("Feb"));

        System.out.println(month.contains("May"));
        System.out.println(month.contains("Dec"));

        System.out.println(month.containsAll(list1)); //ÇOK ÖNEMLİ !!!!!!!
        // Eğer dataları kontrol etmek için containsAll kullanabilirim


        if(month.containsAll(list1)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }



    }
}
