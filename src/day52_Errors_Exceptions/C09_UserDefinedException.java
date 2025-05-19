package day52_Errors_Exceptions;

import day52_Errors_Exceptions.Exceptions.NameException;

public class C09_UserDefinedException {

    public static void main(String[] args) {

        String name = "";


    }
    public static void nameValidation(String str){
        if(str.length()<3){
          //  throw new NameException("Name 3 harften küçük olamaz");  tamamla
        }
    }
}
