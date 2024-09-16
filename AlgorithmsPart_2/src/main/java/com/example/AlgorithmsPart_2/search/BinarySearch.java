package com.example.AlgorithmsPart_2.search;

public class BinarySearch {

    // Метод для выполнения бинарного поиска
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Находим средний индекс

            // Проверяем, равен ли целевой элемент среднему элементу
            if (array[mid] == target) {
                return mid; // Элемент найден, возвращаем индекс
            }

            // Если целевой элемент больше среднего элемента,
            // то он может быть только в правой подмассиве
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                // Если целевой элемент меньше среднего элемента,
                // то он может быть только в левой подмассиве
                right = mid - 1;
            }
        }

        // Если элемент не найден, возвращаем -1
        return -1;
    }

    // Пример использования метода binarySearch
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Элемент найден на индексе: " + result);
        } else {
            System.out.println("Элемент не найден.");
        }
    }
}