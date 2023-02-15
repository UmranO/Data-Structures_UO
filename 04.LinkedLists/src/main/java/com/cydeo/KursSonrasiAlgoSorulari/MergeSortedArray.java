package com.cydeo.KursSonrasiAlgoSorulari;

import java.util.Arrays;

public class MergeSortedArray {

    public static int[] merge() {

        int[] arrA = {9, 100, 0, 0};
        int m = arrA.length;

        int[] arrB = {7, 8};
        int n = arrB.length;

        for (int i = 0, k = m - n; i <= arrB.length - 1; i++, k++) {
            arrA[k] = arrB[i];
        }
        Arrays.sort(arrA);
        System.out.println(Arrays.toString(arrA));
        return arrA;
    }
//__________________________________________________________________
    public static void main(String[] args) {
        merge();
//__________________________________________________________________

        int[] num1 = {1, 2, 3, 0, 0, 0};
        int m = num1.length;

        int[] num2 = {2, 5, 6};
        int n = num2.length;

        for (int i = 0, k = m - n; i <= num2.length - 1; i++, k++) {
            num1[k] = num2[i];
        }
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));
    }
}
















