/**
 * 3. Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все одинаковы и No – если имеется хоть одно различие.
 * Массив задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 3, 2, 53, 6, 32, 8};
        int[] array2 = {1, 1, 1, 1, 1, 1};

        isSameValues(array1);
        isSameValues(array2);
    }

    /**
     * Метод проверяет, все ли значения в массиве одинаковые и выводит результат в консоль
     */
    public static void isSameValues(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
