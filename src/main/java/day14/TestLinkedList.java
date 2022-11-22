package day14;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        // 将元素插入到列表开头
        linkedList.addFirst("abc");
        linkedList.addFirst("def");
        // 将元素插入到列表结尾
        linkedList.addLast("def");
        // 返回此列表第一个元素
        System.out.println(linkedList.getFirst());
        // 返回此列表最后一个元素
        System.out.println(linkedList.getLast());
        // 移除此列表第一个元素
        System.out.println(linkedList.removeFirst());
        // 移除此列表最后一个元素
        System.out.println(linkedList.removeLast());

        // 将元素推入此列表表示的堆栈
        linkedList.push("aaa");
        linkedList.push("bbb");
        // 从此列表弹出的第一个元素
        System.out.println(linkedList.pop());
        // 列表中是否有元素
        System.out.println(linkedList.isEmpty());


    }
}
