package day36_Review;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class C07_BigInteger {
    public static void main(String[] args) {

        BigInteger bigInteger= new BigInteger("22222222224442222222662222222228888888822222222222222222");

        System.out.println("bigInteger = " + bigInteger);

        BigInteger sonuc = new BigInteger("0");

        sonuc = bigInteger.multiply(bigInteger);
        System.out.println("sonuc = " + sonuc);

        bigInteger = bigInteger.add(new BigInteger("66777888999999999"));
        System.out.println("bigInteger = " + bigInteger);

        BigDecimal bigDecimal = new BigDecimal("334556.33456677");

        BigDecimal result = bigDecimal.divide(BigDecimal.valueOf(5),25,RoundingMode.UP);
        System.out.println("result = " + result);

        // ikili sayı sistemindeki bir sayının desimal değeri
        BigInteger bg = new BigInteger("1010",2);
        System.out.println("bg = " + bg);

        BigInteger hexBG = new BigInteger("2A",16);
        System.out.println("hexBG = " + hexBG);




    }
}
