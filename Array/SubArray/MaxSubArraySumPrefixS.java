package SubArray;

/*
 * PrefixSum  Approach
 *  Maximum subarray sum:
 * Given an integer array of size N,
 * find the contiguous subarray(containing atleast one number)which has the largest sum and return its sum.
 *
 * Input:[-2,1,-3,4,-1,2,1,-5,4]
 * Output:6
 *
 * Explanation:[4,-1,2,1]has the largest sum=6
 */
public class MaxSubArraySumPrefixS {
    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int psArr[] = new int[arr.length];
        psArr[0] = arr[0];
        int maxEle = Integer.MIN_VALUE;
        System.out.print("MaxSubarray Sum : ");
        for (int i = 1; i < arr.length; i++) {
            psArr[i] = psArr[i - 1] + arr[i];

        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    sum = psArr[j];
                } else {

                    sum = psArr[j] - psArr[i - 1];
                }
                if (maxEle < sum) {
                    maxEle = sum;
                }
            }
        }
        System.out.println(maxEle);
    }

}
// Time Complexity : O(N^2)
// Space Complexity : O(N)
