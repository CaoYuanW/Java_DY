package day13;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {

        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.02");


        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        // 保留几位小数  舍入模式
        System.out.println(b1.divide(b2,2,BigDecimal.ROUND_CEILING));

    }
}
