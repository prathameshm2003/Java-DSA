package CarryForward;

/*
 * Given an integer array of size N.
 * Build an array leftmax of size N.
 * LeftMax of i contains the maximun for the index 0 to the index i 
 *
 * Arr : [-3,6,2,4,5,2,8,-9,3,1]
 * N : 10
 * LeftMax : [-3,6,6,6,6,6,8,8,8,8]
 */

//Optimized approach
public class LeftMaxOptimized {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int N = 10;
        int leftMax[] = new int[N];
        // int maxEle = Integer.MIN_VALUE;
        leftMax[0] = arr[0];

        for (int i = 1; i < N; i++) {
            if (leftMax[i - 1] < arr[i]) {
                leftMax[i] = arr[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(leftMax[i] + " ");
        }
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
