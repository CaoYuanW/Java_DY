package day11;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println(Person.num);
        Person p1 = new Person();
        Person p2 = new Person();
        p1.num = 1002;
        System.out.println(p2.num);
    }
}

class Person {

    static int num = 1001;

}
