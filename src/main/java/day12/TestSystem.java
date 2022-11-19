package day12;

import java.util.Arrays;
import java.util.Date;

public class TestSystem {
    public static void main(String[] args) {
        int[] arr = new int[]{3,8,2,5,0};
        int[] arr1 = new int[]{0,0,1,0,0};

        // 从arr数组的1号索引位置复制3个元素到arr1的2号索引位置
        System.arraycopy(arr,1,arr1,2,3);
        System.out.println(Arrays.toString(arr1));

        // 返回当前时间距1970 01 01 00 00 00的毫秒数
        System.out.println(System.currentTimeMillis());


        // 退出JVM虚拟机
        System.exit(0);

        // 垃圾回收器回收垃圾
        System.gc();

    }
}
