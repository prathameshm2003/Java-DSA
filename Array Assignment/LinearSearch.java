package ArrayAssignment;

/*
 * Problem Description
Given an array A and an integer B, find the number of occurrences
of B in A.
Problem Constraints
1 <= B, Ai <= 109
1 <= length(A) <= 105
Example Input
Input 1:
A = [1, 2, 2], B = 2
Input 2:
A = [1, 2, 1], B = 3
Example Output
Output 1:
2
Output 2:
0
Example Explanation
Explanation 1:
Element at index 2, 3 is equal to 2 hence count is 2.
Explanation 2:
There is no element equal to 3 in the array.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 2, 2 };
        int arr2[] = new int[] { 1, 2, 1 };
        int B1 = 2;
        int B2 = 3;
        int N1 = arr1.length;
        int N2 = arr2.length;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < N1; i++) {
            if (arr1[i] == B1) {
                count1++;
            }

        }
        System.out.println(count1);

        for (int i = 0; i < N2; i++) {
            if (arr2[i] == B2) {
                count2++;
            }

        }
        System.out.println(count2);
    }

}
