package day02;

public class TestDataType {
    public static void main(String[] args) {
        byte b = 10 + 20;
        System.out.println(b);

        byte b1 = 10;
        //byte B2 = b1 + 20;  异常，类型不匹配

        double d = 10;
        System.out.println(d);


        int a = 50;
        short s = (short) a;
        System.out.println(s);
    }
}
