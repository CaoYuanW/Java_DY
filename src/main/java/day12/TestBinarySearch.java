package day12;

public class TestBinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 8, 10, 12, 15, 30, 35, 40, 50, 100};
        int num = 15;
        int index = getIndex(num, arr);
        System.out.println(index);

    }

    public static int getIndex(int num, int[] arr) {
        int min = 0;
        int max = arr.length - 1;
        int mid;

        while (min < max) {
            mid = (min + max) / 2;
            if (num > arr[mid]) {
                min = mid + 1;
            } else if (num < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}