package AdditionalTasks;

/**
 * 4. Написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно повторение. Массив задается и инициализируется в начале
 * программы.
 */
public class Task04 {
    public static void main(String[] args) {
        int[] array1 = {3, 15, 9, 20, 2, 7, 6, 1, 5, 0};
        int[] array2 = {1, 1, 1, 1, 1, 1};

        isDifferentValues(array1);
        isDifferentValues(array2);
    }

    /**
     * Метод проверяет, все ли значения в массиве разные и выводит результат в консоль
     */
    public static void isDifferentValues(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == i) continue;
                if (array[j] == array[i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
