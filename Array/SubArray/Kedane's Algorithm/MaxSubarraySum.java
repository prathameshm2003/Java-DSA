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
 * Explanation:[4,-1,2,1]has the largest sum=6
 */
public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int sum = 0;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > maxEle) {
                maxEle = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxEle);

    }

}
// Time Complexity : O(N)
// Space Complexity : O(1)
