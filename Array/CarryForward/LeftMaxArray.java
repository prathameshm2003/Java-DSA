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

//Bruteforce approch
public class LeftMaxArray {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int N = 10;
        int leftMax[] = new int[N];
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= i; j++) {
                if (maxEle < arr[j]) {
                    maxEle = arr[j];
                }

            }
            leftMax[i] = maxEle;

        }
        for (int i = 0; i < N; i++) {
            System.out.print(leftMax[i] + " ");
        }
    }

}

// Time complexity : O(N*N)
// Space complexity : O(1)
