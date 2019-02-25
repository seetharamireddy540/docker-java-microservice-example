package com.ram.sorting;

import java.util.Arrays;

public class MergeSortApp {

    public static void main(final String[] arg) {

        final int[] array = {10, 4, 11, 9, 34, 54, 91, 19};

        System.out.println("Array before sorting - " + Arrays.toString(array));

        sort(array, 0, array.length - 1);
        System.out.println("Array after sorting - " + Arrays.toString(array));
    }

    static void merge(final int[] arr, final int l, final int m, final int r) {
        // Find sizes of two subarrays to be merged
        final int n1 = m - l + 1;
        final int n2 = r - m;

        /* Create temp arrays */
        final int[] L = new int[n1];
        final int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(final int[] arr, final int l, final int r) {
        if (l < r) {
            // Find the middle point
            final int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            MergeSortApp.merge(arr, l, m, r);
        }
    }
}
