package Prefixsum;

import java.util.Scanner;

public class InPlacePrefixSum {
    public static int[] computePrefixSumInPlace(int[] A) {
        // Iterate through the array to compute prefix sums
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i] + A[i - 1];
        }

        return A;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] A = new int[n];

        // Read the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Compute the prefix sum
        int[] result = computePrefixSumInPlace(A);

        // Print the result
        System.out.println("Prefix sum of the array: " + java.util.Arrays.toString(result));

    }
}

// TC===>O(Q+N)
