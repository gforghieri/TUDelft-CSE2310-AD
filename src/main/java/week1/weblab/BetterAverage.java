package week1.weblab;

import java.io.*;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class BetterAverage {

    public static double solve(int n, double[] arr) {
        int mid = arr.length / 2;
        double[] a = Arrays.copyOfRange(arr, 0, mid);
        double[] b = Arrays.copyOfRange(arr, mid, arr.length);
//        boolean isSorted = false;
//        double[] temp = new double[1];
        double[][] sorted = mergeSort(a, b, );
//        Stream<double[]> doubleStream = Stream.of(sorted);
//        DoubleStream dStream = Stream.of(sorted).flatMapToDouble(d -> Arrays.stream(d));
//        arr = dStream.toArray();
//        double res = 0;
//        if (arr.length % 2 == 0) {
//            res = (arr[mid] + arr[mid - 1]) / 2;
//        } else res = arr[mid];
//        return res;
    }

    public static double[][] mergeSort(double[] arr, int l, int r) {
        isSorted = false;
        int aMid = a.length / 2;
        int bMid = b.length / 2;
        temp = new double[a.length + b.length];
        if (a.length == 1 && b.length == 1) {
            if (a[0] <= b[0]) {
                temp[0] = a[0];
                temp[1] = b[0];
            } else {
                temp[0] = b[0];
                temp[1] = a[0];
            }
        }
        // left
        return mergeSort();
        // right
        return mergeSort(Arrays.copyOfRange(b, 0, bMid), Arrays.copyOfRange(a, bMid, b.length), isSorted);
        }

        public static double[] merge(double[] a, double[] b) {
        
    }
}