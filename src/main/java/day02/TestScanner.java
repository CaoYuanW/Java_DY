package day02;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        //从键盘获取一个整数
        int number = sc.nextInt();
        System.out.println(number);
    }
}
