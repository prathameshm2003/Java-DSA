/*
 * Given an array of size N & Q number of queries.
 * Querry contains two (s,e), s==>start index and e==>end index
 * for all queries print the sum of all elements from s to e index.
 */

package Prefixsum;

import java.util.*;

class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int N = 10;
        int Q = 3;

        int psArr[] = new int[N];
        psArr[0] = arr[0];

        // Prefix sum
        for (int i = 1; i < N; i++) {
            psArr[i] = psArr[i - 1] + arr[i];
            System.out.println(psArr[i]);

        }

        int sum = 0;
        for (int i = 1; i < Q; i++) {
            System.out.println("start : ");
            int startIndex = sc.nextInt();
            System.out.println("end : ");
            int endIndex = sc.nextInt();
            if (startIndex == 0) {
                sum = psArr[endIndex];

            } else {
                sum = psArr[endIndex] - psArr[startIndex - 1];
                // sum = psArr[startIndex - 1] + arr[endIndex];

            }

            System.out.println(sum);

        }
        // System.out.println(sum);

    }
}

// TC===>O(Q+N)
