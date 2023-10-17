package array;

import array.Array;

import java.util.Scanner;

public class Main {
    /**
     * Создается массив из целых чисел и производится анализ этого массива:
     * - количество четных элементов;
     * - разница между максимальным значением элемента в массиве и минимальным;
     * - проверяется существуют ли два соседних элемента в массиве с нулевыми значениями.
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите размер массива: ");
            int size = scan.nextInt();
            int[] array = Array.createArray(size);
            Array.printArray(array);
            int countevenNumber = Arraytasks.countEvens(array);
            System.out.printf("Количество четных элементов в массиве: %d\n", countevenNumber);
            int difference = Arraytasks.differenceMaxMin(array);
            System.out.printf("Разница между максимальным значением элемента в массиве и минимальным: %d\n", difference);
            boolean zero = Arraytasks.zeroValues(array);
            System.out.println("Два соседних элемента в массиве имеют нулевые значения: " + zero);
        }
    }
}
