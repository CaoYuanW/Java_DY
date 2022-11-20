package day09;


import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("Abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // 将字节数组转化为字符串
        byte[] b1 = new byte[]{97, 98, 99};
        String s3 = new String(b1);
        System.out.println(s3);

        String s4 = new String(b1, 1, 2);
        System.out.println(s4);

        // 将字符数组转换为字符串
        char[] c1 = new char[]{'A', 'B', 'C'};
        String s5 = new String(c1);
        System.out.println(s5);

        String s6 = new String(c1, 1, 2);
        System.out.println(s6);

        // 将字符串转换为字节数组/字符数组
        String s7 = "abcd";
        byte[] b2 = s7.getBytes();
        char[] c2 = s7.toCharArray();

        // 替换
        String s8 = "I love java java";
        String s9 = s8.replace("java", "bigdata");
        String s10 = s8.replaceAll("java", "bigdata");
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s10);

        // 长度 拼接 索引位置元素 第一次/最后一次出现的索引 截取 是否为空
        System.out.println(s8.length());
        System.out.println(s8.concat(s9));
        System.out.println(s8.charAt(2));
        System.out.println(s8.indexOf('l'));
        System.out.println(s8.indexOf("java"));
        System.out.println(s8.lastIndexOf("a"));
        System.out.println(s8.substring(2));
        System.out.println(s8.substring(2, 6));
        System.out.println(s8.isEmpty());

        // 遍历
        for (int i = 0; i < s8.length(); i++) {
            char c = s8.charAt(i);
            System.out.println(c);
        }

        // 开头结尾 大小写 去空格
        System.out.println(s8.toUpperCase());
        System.out.println(s8.toLowerCase());
        System.out.println(s8.startsWith("I love"));
        System.out.println(s8.endsWith("java"));
        System.out.println(s8.trim());

        //切分
        String s11 = "1-2-3-4";
        String[] nums = s11.split("-");
        System.out.println(Arrays.toString(nums));
    }
}
