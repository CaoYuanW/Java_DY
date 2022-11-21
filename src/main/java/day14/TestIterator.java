package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList();
        col.add("qwe");
        col.add("asd");
        col.add("zxc");
        Iterator<String> iter = col.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        Collection<String> col1 = new ArrayList();
        col1.add("qwe");
        col1.add("asd");
        col1.add("zxc");
        Iterator<String> iter1 = col1.iterator();
        while (iter1.hasNext()) {
            String s = iter1.next();
            if ("qwe".equals(s)) {
                iter1.remove();
            }
        }
        System.out.println(col1);

        for (String s : col) {
            System.out.println(s);
        }

    }
}
