package AdditionalTasks;

import java.util.Random;
import java.util.Scanner;

/**
 * 8. Заполнить массив размерности n случайными строчными латинскими буквами.
 * Подсчитать, сколько раз встречается каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = sc.nextInt();
        char[] array = new char[n];
        int codeA = 97;
        int codeZ = 122;

        fillRandomArray(array, codeA, codeZ);
        System.out.println("Буквы в массиве:");
        letterCounter(array, codeA, codeZ);
        System.out.println("Больше 3 раз встречаются буквы:");
        letterCounter(array, codeA, codeZ, 3);
    }

    /**
     * Метод заполняет массив типа char рандомными значениями в заданном диапозоне.
     *
     * @param minValue минимальное значение заполняемого символа (код в десятичном формате)
     * @param maxValue максимальное значение заполняемого символа (код в десятичном формате)
     */
    public static void fillRandomArray(char[] array, int minValue, int maxValue) {
        Random rm = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rm.nextInt(minValue, maxValue + 1);
        }
    }

    /**
     * Метод выводит в консоль сколько раз встречается каждая буква в массиве
     *
     * @param minValue минимальное значение заполняемого символа (код в десятичном формате)
     * @param maxValue максимальное значение заполняемого символа (код в десятичном формате)
     */
    public static void letterCounter(char[] array, int minValue, int maxValue) {
        for (int i = minValue; i <= maxValue; i++) {
            int count = 0;
            for (int value : array) {
                if (value == i) count++;
            }
            if (count > 0) System.out.println((char) i + " (" + count + " шт.)");
        }
    }

    /**
     * Метод выводит в консоль буквы, которые встречаются в массиве более заданного значения numberOfcounts,
     * а так же выводит сколько раз они встречаются
     *
     * @param minValue       минимальное значение заполняемого символа (код в десятичном формате)
     * @param maxValue       максимальное значение заполняемого символа (код в десятичном формате)
     * @param numberOfcounts значение, которое задает более скольки раз, встречается буква в массиве
     */
    public static void letterCounter(char[] array, int minValue, int maxValue, int numberOfcounts) {
        for (int i = minValue; i <= maxValue; i++) {
            int count = 0;
            for (int value : array) {
                if (value == i) count++;
            }
            if (count > numberOfcounts) System.out.println((char) i + " (" + count + " шт.)");
        }
    }
}
