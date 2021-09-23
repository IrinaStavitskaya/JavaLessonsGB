package Lesson_2;

public class HomeWorkApp_2 {
    public static void main(String[] args) {
        int a = 14;
        int b = 6;
        System.out.println(checkSum(a, b));

        int num = 0;
        checkNum(num);

        int d = 0;
        System.out.println(checkNumBoolean(d));

        String f = "Добрый день!";
        int g = 1;
        printString(f, g);

        int nowYear = 444;
        System.out.println(checkYear(nowYear));
    }
    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void checkNum(int num) {
        if (num >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }
    public static boolean checkNumBoolean(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void printString(String f, int g) {
        if (g <= 0) {
            System.out.println("Надо вести положительное число");
        }
        for (int i = 1; i <= g; i++ ) {
            System.out.println(f);
        }
    }
    public static boolean checkYear(int year) {
        if (year == 0) {
            return false;
        }
        if (year % 4 != 0) {
            return false;
        } else {
            if (year % 400 == 0) {
                return true;
            }
            if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
