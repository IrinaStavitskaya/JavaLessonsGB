package Lesson_3;


import java.util.Scanner;

public class HomeWorkApp_3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Commit base one
        exchangeNumber();
        fillArr();
        toDouble();
        fillDiagonal();

        fillArrValue(inputNumber("Введите число больше 0: "), inputNumber("Введите любое число: "));

        findMaxMinInArr();
    }
    public static int inputNumber(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
        System.out.println();
    }
    public static void exchangeNumber() {
        int[] newArray = {1, 0, 0, 1, 0, 0};
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 1) {
                newArray[i] = 0;
            } else {
                newArray[i] = 1;
            }
        }
        printArray(newArray);
    }
    public static void fillArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);
    }
    public static void toDouble() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        printArray(arr2);
    }
    public static void fillDiagonal() {
        int[][] arrQ = new int[4][4];
        for (int y = 0; y < arrQ.length; y++) {
            for (int x = 0; x < arrQ[y].length; x++) {
                if (x == y || x + y == arrQ.length - 1) {
                    arrQ[x][y] = 1;
                }
                System.out.print(arrQ[x][y] + "\t");
            }
            System.out.println();
        }
    }
    public static void fillArrValue(int len, int initialValue) {
        if (len <= 0) {
            System.out.println("Первый аргумент должен быть больше 0");
        } else {
            int[] arr5 = new int[len];
            for (int x = 0; x < len; x++) {
                arr5[x] = initialValue;
            }
            printArray(arr5);
        }
    }
    public static void findMaxMinInArr() {
        int [] arr6 = {0, 4, 10, -5, 3};
        int max = arr6[0];
        int min = arr6[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
}
