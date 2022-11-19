package day09;



public class TestBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append(10);
        sb.append("qwe");
        System.out.println(sb);

        // StringBuilder->String
        String s = sb.toString();
        System.out.println(s);
    }
}
