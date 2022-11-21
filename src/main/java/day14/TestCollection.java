package day14;


import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {

        Collection<String> col = new ArrayList();
        col.add("abc");
        col.add("qwe");
        col.add("rtyu");
        col.add("uio");

        col.remove("abc");
        System.out.println(col.contains("qwe"));
        System.out.println(col.isEmpty());
        System.out.println(col.size());

        Object[] objects = col.toArray();
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof String) {
                String s = (String) objects[i];
                System.out.println(s);
            }
        }

        col.clear();

    }
}
