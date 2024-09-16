package com.example.AlgorithmsPart_2.utilit;

import java.util.Arrays;
import java.util.Random;

public class CompareSorting {

    public static void main(String[] args) {
        int size = 10000; // Размер массива для сортировки
        Integer[] array1 = generateRandomArray(size);
        Integer[] array2 = Arrays.copyOf(array1, array1.length); // Копируем массив для сравнения

        long startTime = System.nanoTime();
        SortingUtils.mergeSort(array1); // Используем метод mergeSort из класса SortingUtils
        long endTime = System.nanoTime();
        long mergeSortTime = endTime - startTime;

        startTime = System.nanoTime();
        Arrays.sort(array2); // Используем встроенный метод сортировки Java
        endTime = System.nanoTime();
        long javaSortTime = endTime - startTime;

        System.out.println("Время выполнения Merge Sort: " + mergeSortTime + " нс");
        System.out.println("Время выполнения Java Sort: " + javaSortTime + " нс");
    }

    // Генерация массива случайных чисел
    private static Integer[] generateRandomArray(int size) {
        Random rand = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000); // Случайные числа от 0 до 9999
        }
        return array;
    }
}