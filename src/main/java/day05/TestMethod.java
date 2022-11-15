package day05;

public class TestMethod {
    public static void main(String[] args) {
        System.out.println(summation(1, 2));
        System.out.println(summation(1, 2, 3));
    }

    public static int summation(int a, int b) {
        return a + b;
    }


    public static int summation(int a, int b, int c) {
        return a + b + c;
    }


}
