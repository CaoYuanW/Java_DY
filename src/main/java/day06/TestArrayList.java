package day06;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("def");
        System.out.println(list.size());
        System.out.println(list.get(0));

        //指定位置添加元素
        list.add(1,"ghi");
        //删除某个元素
        list.remove("abc");
        //删除某个未知元素
        list.remove(1);
        //修改指定索引位置元素
        list.set(0,"qwe");
        //清空元素
        list.clear();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }
}
