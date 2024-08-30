/**
 * 1. Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 */
public class Task01 {
    public static void main(String[] args) {
        int[] fibArray = new int[15];

        for (int i = 0; i < fibArray.length; i++) {
            if (i < 2) fibArray[i] = i;
            else fibArray[i] = fibArray[i - 1] + fibArray[i - 2];

            if (fibArray[i] % 2 == 0) System.out.print(fibArray[i] + " ");
        }
    }
}
