package SubArray;

/*
 *  Given an array of size N.
 * int arr[]=new int[]{2,4,1,3};
 * - print the sum of every single subarray using Prefix sum technique.
 */
//Optimized
public class SumofArrPrefixsum {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 3 };
        int psArr[] = new int[arr.length];
        psArr[0] = arr[0];
        System.out.print("Prefixsum : ");
        for (int i = 1; i < arr.length; i++) {
            psArr[i] = psArr[i - 1] + arr[i];

            System.out.print(psArr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of subarray : ");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                if (i == 0) {
                    sum = psArr[j];
                } else {

                    sum = psArr[j] - psArr[i - 1];
                }
                System.out.println(sum);
            }
        }

    }

}
// Time Complexity : O(N^2)
// Space Complexity : O(N)
