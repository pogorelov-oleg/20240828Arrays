package AdditionalTasks;

import java.util.Random;

/**
 * 6. Заполнить массив на 10 элементов случайными числами
 * от -10 до +10. Посчитать количество уникальных значений
 * (встречающихся в массиве один раз). Вывести на консоль
 * значения уникальных элементов и индексы, под которыми
 * они находятся в массиве.
 */
public class Task06 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int minValue = -10;
        int maxValue = 10;
        int count = 0;
        boolean flag;

        fillRandomArray(array, minValue, maxValue);
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length; j++) {
                if (j == i) continue;
                if (array[j] == array[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.printf("index = %d, value = %d\n", i, array[i]);
            }
        }

        System.out.println("Количество уникальных элементов: " + count);
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
