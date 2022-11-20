package day13;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {

        BigInteger b1 = new BigInteger("111111111111111111111111111111111111");
        BigInteger b2 = new BigInteger("222222222222222222222222222222222222");

        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));

    }
}
