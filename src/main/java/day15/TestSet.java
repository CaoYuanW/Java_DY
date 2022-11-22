package day15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(123);
        treeSet.add(111);
        treeSet.add(156);
        System.out.println(treeSet);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("qwe");
        hashSet.add("rty");
        hashSet.add("uio");
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("123");
        linkedHashSet.add("456");
        linkedHashSet.add("789");
        linkedHashSet.add("012");
        System.out.println(linkedHashSet);
    }
}
