package SubArray;

/*
 * Given an array of size N.
 * Find the total sum of all subarray sum.
 * int arr[]=new int[]{1,2,3};
 * 
 * output:20
 */
public class TotalsumSumArr {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3 };
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                System.out.println(sum);
                totalSum = totalSum + sum;

            }

        }
        System.out.println("Total sum of subarray : ");
        System.out.println(totalSum);

    }

}
// Time complexity : O(N*N)
// Space complexity : O(1)
