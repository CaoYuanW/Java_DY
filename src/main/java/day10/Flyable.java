package day10;

public interface Flyable {

    void fly();

    static void method() {
        System.out.println("static");
    }

    default void method1() {
        System.out.println("default");
    }

}
