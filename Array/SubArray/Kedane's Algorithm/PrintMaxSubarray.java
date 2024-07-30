package SubArray.KadanesAlgorithm;

/* Optimized Approach
 * Kadanes algorithm ==>
 *  Maximum subarray sum:
 * Given an integer array of size N,
 * find the contiguous subarray(containing atleast one number)which has the largest sum and return its sum.
 *
 * Input:[-2,1,-3,4,-1,2,1,-5,4]
 * Output:6
 *
 * Explanation:[4,-1,2,1]
 */
public class PrintMaxSubarray {
    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int x = -1;
        int StartIndex = -1;
        int EndIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                x = i;
            }
            sum = sum + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                StartIndex = x;
                EndIndex = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        for (int i = StartIndex; i <= EndIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
