package SubArray;

/*
 *  Given an array of size N.
 * int arr[]=new int[]{2,4,1,3};
 * A. print the sum of every single subarray with Time Complexity O(N) and without using extra space complexity.(Carry Forword)
 */
public class SumofSubarrCarryForward {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 3 };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                System.out.println(sum);

            }
        }

    }

}
// Time Complexity : O(N*N)
// Space Complexity : 0(1)
