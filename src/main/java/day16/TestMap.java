package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        // 添加元素
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println(map);

        // 判断集合中是否包含某个键
        System.out.println(map.containsKey("a"));

        // 删除某个元素
        map.remove("b");

        // 获取某个键对应的值
        System.out.println(map.get("c"));


        // 将map集合中所有的键存入set中
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            Integer value = map.get(next);
            System.out.println(next + " " + value);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "-" + value);
        }
    }
}
