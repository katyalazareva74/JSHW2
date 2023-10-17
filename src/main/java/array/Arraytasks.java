package array;

/**
 * Методы класса выполняют некоторые задачи с массивом.
 */
public class Arraytasks {
    /**
     * Подсчет четных элементов массива.
     *
     * @param array - массив, в котором выполняется подсчет.
     * @return - возвращается количество четных элементов массива.
     */
    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count++;
        }
        return count;
    }

    /**
     * Определение разницы между максимальным значением элемента массива и минимальным.
     *
     * @param array - массив, в котором определяется разница между максимальным значением элемента массива и минимальным.
     * @return - возвращается число, показывающее насколько максимальное значение элемента массива больше минимального.
     */
    public static int differenceMaxMin(int[] array) {
        int min = array[0], max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            else if (array[i] > max)
                max = array[i];
        }
        return max - min;
    }

    /**
     * Метод определяет есть ли в массиве два соседних элемента с нулевыми значениями.
     *
     * @param array - массив, в котором определяется наличие двух соседних элементов с нулевыми значениями.
     * @return - возвращается true, если есть два соседних элемента с нулевыми значениями, и false - если нет.
     */
    public static boolean zeroValues(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] == 0) && (array[i + 1] == 0))
                return true;
        }
        return false;
    }
}
