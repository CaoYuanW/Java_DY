package day13;

public class TestException {
    public static void main(String[] args) throws Exception {

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("继续");

        test();

        System.out.println("继续");
    }

    public static void test() throws Exception {
        throw new Exception();
    }
}
