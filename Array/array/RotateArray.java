package Array;

/*
 * Problem Description
 * -Given an integer array A of size N and an integer B,you have to return same array after rotating it B times
 * towards the right.
 * 
 * Problem Constraints
 * 1<=N<=10^5
 * 1<=A[i]<=10^9
 * 1<=B<=10^9
 * 
 * Example Input
 * Input1:
 * A=[1,2,3,4]
 * B=2
 * Input2:
 * A=[2,5,6]
 */

import java.util.Arrays;

public class RotateArray {
    static int[] rotate(int[] arr, int size, int x) {
        int[] arr2 = new int[size];
        int k = 0;
        for (int i = x; i < arr2.length; i++) {
            arr2[k] = arr[i];
            k++;
        }
        for (int i = 0; i < x; i++) {
            arr2[k] = arr[i];
            k++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr2[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        int arr1[] = rotate(arr, arr.length, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}