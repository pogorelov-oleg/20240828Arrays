import java.util.Random;
import java.util.Scanner;

/**
 * 10. Заполнить массив размерности n случайными цифрами от 0 до 33. Найти элемент массива, который делится
 * без остатка на значение элемента слева и значение элемента справа. Вывести на консоль значения исходного массива.
 * Вывести индекс найденного элемента, если такой не найден,
 * вывести -1. n – задается с клавиатуры.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int minValue = 0;
        int maxValue = 33;
        boolean flag = false;

        fillAndPrintRandomArray(array, minValue, maxValue);
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] != 0 && array[i + 1] != 0) {
                if (array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                    System.out.println("i = " + i);
                    flag = true;
                }
            }
        }
        if (!flag) System.out.println(-1);
    }

    /**
     * Метод заполняет массив рандомными значениями в заданном диапозоне и выводит его в консоль
     */
    public static void fillAndPrintRandomArray(int[] array, int minValue, int maxValue) {
        Random rm = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(minValue, maxValue + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}