package org.example;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец
// три слова: Orange, Banana, Apple.

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

// Создайте метод checkSumsign(), в теле которого объявите две int переменные а и b, и инициализируйте их любыми
    //значениями. Метод должен просуммировать эти переменные, и если их сумма больше
    //или равна 0, то вывести в консоль сообщение "Сумма положительная", в противном случае "Сумма отрицательная";

    public static void checkSumSign() {
        int a = 8, b = 10;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

//Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте любым её значением.
//Если value меньше О (0 включительно), то в консоль метод должен вывести сообщение "Красный", если лежит в пределах
//от 0 (0 исключительно) до 100 (100 включительно), то "Желтый", если больше 100 (100 исключительно)- "Зеленый";

    public static void printColor() {
        int value = 150;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

//Создайте метод compareNumbers(), в теле которого объявите две int переменные а и b, и инициализируйте их
//любыми значениями, которыми захотите. Если а больше или равно b, то необходимо вывести в консоль сообщение "а >=
//b", в противном случае "а < b'";

    public static void compareNumbers() {
        int a = 5, b = 2;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}


