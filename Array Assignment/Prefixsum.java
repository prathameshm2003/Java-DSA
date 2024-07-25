package ArrayAssignment;

/*
 * Problem Description
- Given an array A of N integers.
- Construct the prefix sum of the array in the given array itself.
Problem Constraints
1 <= N <= 105
1 <= A[i] <= 103
Example Input
Input 1:
A = [1, 2, 3, 4, 5]
Input 2:
A = [4, 3, 2]
Example Output
Output 1:
[1, 3, 6, 10, 15]
Output 2:
[4, 7, 9]
Example Explanation
Explanation 1:
The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].
Explanation 2:
The prefix sum array of [4, 3, 2] is [4, 7, 9].
*/
import java.util.*;

public class Prefixsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter of elements in the array :  ");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        System.out.println("prefixsum of given array is : " + java.util.Arrays.toString(arr));

    }
}
