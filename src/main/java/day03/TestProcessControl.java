package day03;

public class TestProcessControl {
    public static void main(String[] args) {
        int number = 20;
        if (number == 20) {
            System.out.println("number");
        }

        if (number > 0) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }


        if (number > 0 && number < 10) {
            System.out.println("0~10");
        } else if (number > 10 && number < 15) {
            System.out.println("10~15");
        } else {
            System.out.println("15~20");
        }


        int week = 2;
        switch (week) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("7");
                break;
        }

    }
}
