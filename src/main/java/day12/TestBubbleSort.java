package day12;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 1, 8, 6, 9};
        TestBubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }


}
