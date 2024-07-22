/*
 * Given an array of size N & Q number of queries.
 * Querry contains two (s,e), s==>start index and e==>end index
 * for all queries print the sum of all elements from s to e index.
 */

package Array;

import java.util.*;

class ArrayDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int N = 10;
        int Q = 3;
        int sum = 0;

        for (int i = 1; i <= Q; i++) {
            System.out.print("start : ");
            int start = sc.nextInt();
            System.out.print("end : ");
            int end = sc.nextInt();
            sum = 0;
            for (int j = start; j <= end; j++) {
                sum = sum + arr[j];

            }
            System.out.println(sum);

        }

    }
}
