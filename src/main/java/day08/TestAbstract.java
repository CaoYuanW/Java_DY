package day08;

public class TestAbstract {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.work();
    }
}


abstract class Employee {
    public abstract void work();
}


class Teacher extends Employee {

    @Override
    public void work() {
        System.out.println("teacher work");
    }
}