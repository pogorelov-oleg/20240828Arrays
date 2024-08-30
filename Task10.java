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
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = sc.nextInt();
        int[] arrray = new int[n];
        int minValue = 0;
        int maxValue = 33;

        for (int i = 0; i < arrray.length; i++) {
            arrray[i] = rm.nextInt(minValue, maxValue + 1);
            System.out.print(arrray[i] + " ");
        }
        System.out.println();
        boolean flag = false;
        for (int i = 1; i < arrray.length - 1; i++) {
            if (arrray[i - 1] != 0 && arrray[i + 1] != 0) {
                if (arrray[i] % arrray[i - 1] == 0 && arrray[i] % arrray[i + 1] == 0) {
                    System.out.println("i = " + i);
                    flag = true;
                }
            }
        }
        if (!flag) System.out.println(-1);
    }
}