package day13;

public class TestTransformation {
    public static void main(String[] args) {

        // 基本数据类型-->包装类
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("10");
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf("10");


        // 自动装箱、自动拆箱
        Integer i5 = 100;
        int i6 = i5;

        // 包装类-->基本数据类型
        int i = i4.intValue();
        System.out.println(i);

        // String -->int
        int i7 = Integer.parseInt("100");

        // int-->String
        String s = 10 + "";

    }
}
