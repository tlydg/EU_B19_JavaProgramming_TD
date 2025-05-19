package day26_StringClass01;

public class Palindrome {
    public static void main(String[] args) {

         /*
    herhangi bir metin tersten de aynı metin ise bu metne palindrom denir
    kulllanıcıdan bir metin alın metin palindrome ise true değil ise false yazdırın
     */
        String metin ="ADA TUT ADA";
        String result ="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            result+=metin.charAt(i);
        }
        if (metin.equalsIgnoreCase(result)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        // diğer projeden 2. çözümü al
        
    }

}
