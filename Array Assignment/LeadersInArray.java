package ArrayAssignment;

/*
 * Problem Description
- Given an integer array A containing N distinct integers, you have to find all
the leaders in array A. An element is a leader if it is strictly greater than all
the elements to its right side.
NOTE: The rightmost element is always a leader.
Problem Constraints
1 <= N <= 105
1 <= A[i] <= 108
Example Input
Input 1:
A = [16, 17, 4, 3, 5, 2]
Input 2:
A = [5, 4]
Example Output
Output 1:
[17, 2, 5]
Output 2:
[5, 4]
Example Explanation
Explanation 1:
Element 17 is strictly greater than all the elements on the right side to it.
Element 2 is strictly greater than all the elements on the right side to it.
Element 5 is strictly greater than all the elements on the right side to it.
So we will return these three elements i.e [17, 2, 5], we can also return [2,
5, 17] or [5, 2, 17] or any other ordering.
Explanation 2:
Element 5 is strictly greater than all the elements on the right side to it.
Element 4 is strictly greater than all the elements on the right side to it.
So we will return these two elements i.e [5, 4], we can also do any other ordering
 */
import java.util.*;

public class LeadersInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] leaders = new int[n];

        int maxFromRight = arr[n - 1];
        leaders[0] = maxFromRight;
        int leaderCount = 1; // Counter for number of leaders found

        // Traverse the array from second last to the first element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders[leaderCount] = arr[i];
                maxFromRight = arr[i];
                leaderCount++;
            }
        }

        // Create a new array to store only the actual leaders found
        int[] actualLeaders = Arrays.copyOfRange(leaders, 0, leaderCount);

        System.out.println("Leaders in the array:");
        System.out.println(Arrays.toString(actualLeaders));
    }
}
