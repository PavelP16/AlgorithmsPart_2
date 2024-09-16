package com.example.AlgorithmsPart_2.utilit;

import java.util.Arrays;

public class SortingUtils {
    public static void mergeSort(Integer[] array) {
        if (array.length < 2) return;

        int mid = array.length / 2;
        Integer[] left = Arrays.copyOfRange(array, 0, mid);
        Integer[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void merge(Integer[] left, Integer[] right, Integer[] merged) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
    }
}