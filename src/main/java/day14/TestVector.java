package day14;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.addElement("abc");
        vector.addElement("def");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
