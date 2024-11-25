package org.example;

public class Lesson_1_2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr6 = {5, 4, 3, 2, 6, 8, 12, 1, 14, 20, 7};
        integerArray(arr1);
        System.out.println();
        emptyArray(100);
        System.out.println();
        smallArray(arr3);
        System.out.println();
        twoArguments(4, 1);
        System.out.println();
    }
    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить О на 1, 1 на 0;

    public static void integerArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");

        }
    }

    //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    // значениями 1 2 3 4 5 6 7 8 100;
    public static void emptyArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    //Задать массив(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;

    public static void smallArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
//цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то
//ectb [0][0), [1][1), [2][2], ..,.[n][n];

    public static void squareArray() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Написать метод, принимающий на вход два аргумента: leп и nitialValue, и возвращающий
// одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
    public static void twoArguments(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "]" + arr[i] + " ");
        }
    }
}



