package SubArray;

/*
 * Given an array of size N.
 * int arr[]=new int[]{2,4,1,3};
 * A. print the sum of every single subarray.
 * B. print the sum of every single subarray using Prefix sum technique.
 * C. print the sum of every single subarray with Time Complexity O(N) and without using extra space complexity.(Carry Forword)
 */
public class SumOfSubarray {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 3 };
        // int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                // System.out.println();
                System.out.println("= " + sum);
            }
        }

    }

}
// Time complexity : O(N^3)
// Space complexity : O(1)
