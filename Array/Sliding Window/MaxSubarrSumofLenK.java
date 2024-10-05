package SlidingWindow;

//Using Prefixsum
public class MaxSubarrSumofLenK {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int k = 4;
        int psArr[] = new int[arr.length];
        psArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psArr[i] = psArr[i - 1] + arr[i];
        }

        int start = 0;
        int end = k - 1;
        int maxEle = Integer.MIN_VALUE;
        while (end < arr.length) {
            int sum = 0;
            if (start == 0) {
                sum = psArr[end];
            } else {
                sum = psArr[end] - psArr[start - 1];
            }

            if (sum > maxEle) {
                maxEle = sum;
            }

            start++;
            end++;
        }
        System.out.println(maxEle);

    }
}

// Time Complexity : N+(N-k)=O(N)
// Space Complexity : O(N)
