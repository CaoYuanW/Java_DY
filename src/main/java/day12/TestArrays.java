package day12;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 10, 12, 15, 30, 35, 40, 50, 100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,10));

        int[] newArr = Arrays.copyOf(arr, 8);
        System.out.println(Arrays.toString(newArr));
    }
}
