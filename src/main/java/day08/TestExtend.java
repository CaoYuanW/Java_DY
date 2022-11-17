package day08;

public class TestExtend {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tom");
        s.setAge(22);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}


class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println("person");
    }

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


class Student extends Person {
    public Student(){
        super();
        System.out.println("student");
    }
}