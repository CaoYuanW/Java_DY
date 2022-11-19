package day12;

public class TestObject {
    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = new String("abc");
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
    }
}


