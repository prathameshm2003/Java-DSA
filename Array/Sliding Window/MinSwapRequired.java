package SlidingWindow;

public class MinSwapRequired {

    public static void main(String[] args) {
        int[] arr = { 1, 12, 10, 14, 3, 10, 5 };
        int B = 8;
        int n = arr.length;

        // Step 1: Count elements <= B
        int countLessEqualB = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= B) {
                countLessEqualB++;
            }

        }

        // Step 2: Try all subarrays of size countLessEqualB
        int minSwaps = Integer.MAX_VALUE;

        for (int i = 0; i <= n - countLessEqualB; i++) {
            int greaterThanB = 0;

            // Check elements in the current subarray
            for (int j = i; j < i + countLessEqualB; j++) {
                if (arr[j] > B) {
                    greaterThanB++;
                }
            }

            // Find the minimum swaps needed
            if (greaterThanB < minSwaps) {
                minSwaps = greaterThanB;
            }
        }

        // Print the result
        System.out.println("Minimum swaps required: " + minSwaps);
    }
}

/*
 * Let's dry run the code for the given array and B = 8 step by step.
 * 
 * Initial Input:
 * arr = {1, 12, 10, 14, 3, 10, 5}
 * B = 8
 * n = arr.length = 7
 * Step 1: Count elements less than or equal to B
 * We need to count how many elements in arr are less than or equal to B (8).
 * 
 * For i = 0, arr[0] = 1 (<= B), so countLessEqualB++ → countLessEqualB = 1
 * For i = 1, arr[1] = 12 (> B), no change.
 * For i = 2, arr[2] = 10 (> B), no change.
 * For i = 3, arr[3] = 14 (> B), no change.
 * For i = 4, arr[4] = 3 (<= B), so countLessEqualB++ → countLessEqualB = 2
 * For i = 5, arr[5] = 10 (> B), no change.
 * For i = 6, arr[6] = 5 (<= B), so countLessEqualB++ → countLessEqualB = 3
 * So, countLessEqualB = 3.
 * 
 * Step 2: Try all subarrays of size countLessEqualB (size 3) and calculate
 * swaps needed.
 * We will slide a window of size 3 across the array and check how many elements
 * in the current window are greater than B. The minimum number of such elements
 * in any window will be the minimum swaps required.
 * 
 * Window 1: Subarray starting from index 0 (i = 0)
 * Subarray = {1, 12, 10}
 * For j = 0, arr[0] = 1 (<= B), no change.
 * For j = 1, arr[1] = 12 (> B), greaterThanB++ → greaterThanB = 1
 * For j = 2, arr[2] = 10 (> B), greaterThanB++ → greaterThanB = 2
 * Swaps required = 2. minSwaps = 2.
 * 
 * Window 2: Subarray starting from index 1 (i = 1)
 * Subarray = {12, 10, 14}
 * For j = 1, arr[1] = 12 (> B), greaterThanB++ → greaterThanB = 1
 * For j = 2, arr[2] = 10 (> B), greaterThanB++ → greaterThanB = 2
 * For j = 3, arr[3] = 14 (> B), greaterThanB++ → greaterThanB = 3
 * Swaps required = 3. minSwaps = 2 (no change, since 3 > 2).
 * 
 * Window 3: Subarray starting from index 2 (i = 2)
 * Subarray = {10, 14, 3}
 * For j = 2, arr[2] = 10 (> B), greaterThanB++ → greaterThanB = 1
 * For j = 3, arr[3] = 14 (> B), greaterThanB++ → greaterThanB = 2
 * For j = 4, arr[4] = 3 (<= B), no change.
 * Swaps required = 2. minSwaps = 2 (no change).
 * 
 * Window 4: Subarray starting from index 3 (i = 3)
 * Subarray = {14, 3, 10}
 * For j = 3, arr[3] = 14 (> B), greaterThanB++ → greaterThanB = 1
 * For j = 4, arr[4] = 3 (<= B), no change.
 * For j = 5, arr[5] = 10 (> B), greaterThanB++ → greaterThanB = 2
 * Swaps required = 2. minSwaps = 2 (no change).
 * 
 * Window 5: Subarray starting from index 4 (i = 4)
 * Subarray = {3, 10, 5}
 * For j = 4, arr[4] = 3 (<= B), no change.
 * For j = 5, arr[5] = 10 (> B), greaterThanB++ → greaterThanB = 1
 * For j = 6, arr[6] = 5 (<= B), no change.
 * Swaps required = 1. minSwaps = 1 (update).
 * 
 * Step 3: Print the result
 * The minimum number of swaps required is 1.
 */
