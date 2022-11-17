package day07;

public class TestPrivate {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Tom");
        p1.setAge(22);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}

class Person {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


