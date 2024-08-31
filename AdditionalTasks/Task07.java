package AdditionalTasks;

import java.util.Random;
import java.util.Scanner;

/**
 * 7. Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая цифра.
 * Вывести результат на экран. n – задается с клавиатуры.
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int minValue = 3;
        int maxValue = 13;

        fillRandomArray(array, minValue, maxValue);
        for (int i = minValue; i <= maxValue; i++) {
            int count = 0;
            for (int value : array) {
                if (value == i) count++;
            }
            if (count > 0) System.out.println(i + " (" + count + " шт.)");
        }
    }

    /**
     * Метод заполняет массив рандомными значениями в заданном диапозоне
     */
    public static void fillRandomArray(int[] array, int minValue, int maxValue) {
        Random rm = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(minValue, maxValue + 1);
        }
    }
}
