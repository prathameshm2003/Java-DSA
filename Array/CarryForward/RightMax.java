package CarryForward;
/*
 * Given an integer array of size N.
 * Build an array Rightmax of size N.
 * RightMax of i contains the maximun for the index i to the index N-1 
 *
 * Arr : [-3,6,2,4,5,2,8,-9,3,1]
 * N : 10
 * RightMax : [8,8,8,8,8,8,8,3,3,1]
 */

//Optimized
public class RightMax {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int N = 10;
        int RightMax[] = new int[N];
        // int maxEle = Integer.MIN_VALUE;
        RightMax[N - 1] = arr[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > RightMax[i + 1]) {
                RightMax[i] = arr[i];
            } else {
                RightMax[i] = RightMax[i + 1];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(RightMax[i] + " ");
        }
    }
}
