package SlidingWindow;

//Using Sliding window
public class MaxSubarrSumofLenK2 {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int k = 4;
        int start = 0;
        int end = k - 1;
        int sum = 0;
        for (int i = 0; i <= end; i++) {
            sum = sum + arr[i];
        }

        start = 1;
        end = k;
        int maxEle = Integer.MIN_VALUE;
        while (end < arr.length) {
            sum = sum - arr[start - 1] + arr[end];
            if (maxEle < sum) {
                maxEle = sum;
            }
            start++;
            end++;
        }
        System.out.println(maxEle);

    }
}
