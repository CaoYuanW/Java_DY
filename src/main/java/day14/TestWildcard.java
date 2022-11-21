package day14;

import java.util.ArrayList;

public class TestWildcard {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        method(list);
        method(list2);
    }

    // ?代表通配符
    public static void method(ArrayList<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
