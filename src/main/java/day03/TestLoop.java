package day03;

public class TestLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int number = 20;
        while (number < 30) {
            System.out.println(number);
            number++;
        }

        int num = 25;
        do {
            num++;
            System.out.println(num);
        } while (num < 30);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i=" + i + ",j=" + j);
            }
        }

    }
}
