package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("qwe");
        list.add("ghj");
        // 打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
        // 根据元素自然顺序排序
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("Bob", 22));
        list1.add(new Person("Sam", 24));
        list1.add(new Person("Jack", 23));
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(234);
        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list2);
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Perosn{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}