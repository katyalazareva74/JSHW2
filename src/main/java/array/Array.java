package array;

import java.util.Random;

public class Array {
    /**
     * Создание массива из целых числе из диапазона значений [-100, 100).
     *
     * @param size - размер массива.
     * @return - возвращается сформированный массив.
     */
    public static int[] createArray(int size) {
        int[] array = new int[size];
        int max = 100;
        int min = -100;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
        return array;
    }

    /**
     * Метод вывода в консоль массива.
     *
     * @param array - массив, который нужно вывести в консоль.
     */
    public static void printArray(int[] array) {
        System.out.printf("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.printf("%d, ", array[i]);
            else
                System.out.printf("%d", array[i]);
        }
        System.out.println(" ]");
    }
}
