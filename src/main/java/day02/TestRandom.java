package day02;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {

        Random r = new Random();
        //随机生成一个[0，1)之间的小数
        double doubleNumber = r.nextDouble();
        System.out.println(doubleNumber);

        //随机生成一个[0，100)之间的整数
        int intNumber = r.nextInt(100);
        System.out.println(intNumber);

    }
}
