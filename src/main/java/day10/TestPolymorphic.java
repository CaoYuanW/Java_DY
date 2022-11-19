package day10;

public class TestPolymorphic {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.name);
        fu.test();
    }
}


class Fu{

    String name = "Fu";

    public void test(){
        System.out.println("Fu-test");
    }

}


class Zi extends Fu{

    String name = "Zi";

    @Override
    public void test(){
        System.out.println("Zi-test");
    }

}