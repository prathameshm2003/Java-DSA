package ArrayAssignment;

/*
 * Problem Description
- Given an integer array A of size N.
- In one second, you can increase the value of one element by 1.
- Find the minimum time in seconds to make all elements of the array
equal.
Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000
Example Input
A = [2, 4, 1, 3, 2]
Example output
8
Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class TimeToEquality {
    public static int minTime(int arr[], int size) {
        // Find the maximum value in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Calculate the total seconds required
        int totalSec = 0;
        for (int i = 0; i < size; i++) {
            totalSec = totalSec + (max - arr[i]);
        }
        return totalSec;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 3, 2 };
        System.out.println(minTime(arr, arr.length));
    }
}
