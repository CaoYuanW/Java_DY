package day04;

public class TestArray {
    public static void main(String[] args) {

        int[] arr = new int[3];
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        System.out.println(arr1.length);

        System.out.println(arr[0]);

        arr1[1] = 666;
        System.out.println(arr1[1]);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[][] arr3 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}};
        System.out.println(arr3[0][2]);

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }

    }
}
