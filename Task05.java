import java.util.Random;

/**
 * 5. Заполнить массив на 10 элементов случайными числами
 * от -10 до +10. Посчитать количество повторяющихся значений. Вывести на консоль только повторяющиеся элементы
 * и количество повторений.
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 1 раз
 */
public class Task05 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int minValue = -10;
        int maxValue = 10;

        fillRandomArray(array, minValue, maxValue);

        for (int i = minValue; i <= maxValue; i++) {
            int count = 0;
            for (int value : array) {
                if (value == i) count++;
            }
            if (count > 1) System.out.println(i + " (" + count + ") шт.");
        }
    }

    public static void fillRandomArray(int[] array, int minValue, int maxValue) {
        Random rm = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(minValue, maxValue + 1);
        }
    }
}
