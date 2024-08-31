import java.util.Random;
import java.util.Scanner;

/**
 * 9. Заполнить массив размерности n случайными цифрами
 * от –2 до n. Если в массиве есть хотя бы одно отрицательное
 * значение меньше -1, заменить все отрицательные значение
 * в массиве на квадрат (в степени 2) этих значений. Вывести
 * исходный и результирующий массив на консоль.
 */
public class Task09 {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = sc.nextInt();
        int[] arrray = new int[n];
        boolean hasNegative = false;

        for (int i = 0; i < arrray.length; i++) {
            arrray[i] = rm.nextInt(-2, n + 1);
            if (arrray[i] < -1) {
                hasNegative = true;
            }
            System.out.print(arrray[i] + " ");
        }
        if (hasNegative) {
            System.out.println("\nРезультат: ");
            for (int i = 0; i < arrray.length; i++) {
                if (arrray[i] < 0) arrray[i] *= arrray[i];
                System.out.print(arrray[i] + " ");
            }
        }
    }
}
