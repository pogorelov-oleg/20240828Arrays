import java.util.Random;

/**
 * 2. Заполнить массив на 30 элементов случайными числами
 * от -70 до +50. Найти минимальный элемент и вывести его
 * на консоль. Найти максимальный элемент и вывести его на
 * консоль.
 */
public class Task02 {
    public static void main(String[] args) {
        Random rm = new Random();
        int[] array = new int[30];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(-70, 51);
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        System.out.printf("Min = %d\nMax = %d", min, max);
    }
}
