package org.example;

public class Lesson_1_1 {
    public static void main(String[] args) {
        System.out.println(expressionCheck(14, 8) + "\n");
        checkPositiveNegative(-5);
        System.out.println(checkNegative(-6) + "\n");
        printWordNTimes("BABA YAGA", 5);
        System.out.println(checkLeapYear(1223));
    }

    //Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма
    // лежит в пределах от 10 до 20 (включительно), если да - вернуть true, в противном случае - false.

    public static boolean expressionCheck(int a, int b) {
        return a >= 10 && b <= 20;
    }

    //Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void checkPositiveNegative(int a) {

        System.out.println(a >= 0 ? "Positive/n" : "Negative/n");
    }

    //Напишите метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    // Замечание: ноль считаем положительным числом.

    public static boolean checkNegative(int a) {

        return a < 0;
    }

    //Напишите метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз.
    public static void printWordNTimes(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + str);
        }
    }

    // Напишите метод, который определяет, является ли год високосным, и возвращает boolean
    // (високосный - true, нє високосный - false). Каждый 4-й год является високосным
    //кроме каждого 100-го, при этом каждый 400-й - високосный.
    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}


