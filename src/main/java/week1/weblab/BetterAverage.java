package week1.weblab;

import java.io.*;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.lang.reflect.Method;

class BetterAverage {

    public static double solve(int n, double[] arr) {
        int l = 0;
        int r = arr.length - 1;
        double[] sorted = new double[n];
        int mid = arr.length / 2;
        Method
        sorted = mergeSort(arr, l, r);
        double res = 0;
        if (arr.length % 2 == 0) {
            res = (arr[mid] + arr[mid - 1]) / 2;
        } else res = arr[mid];
        return res;
    }

    static double[] mergeSort(double arr[], int l, int r) {
        double[] res = new double[arr.length];
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            res = merge(arr, l, m, r);
        }
        return res;
    }

    /* The task is to complete merge() which is used
    in below mergeSort() */
// Merges two subarrays of arr[].  First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static double[] merge(double arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        double L[] = new double[n1];
        double R[] = new double[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

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

        /* Copy remaining elements of L[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;
    }
}