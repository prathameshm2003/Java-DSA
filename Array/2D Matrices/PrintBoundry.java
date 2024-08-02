package TwoDMatrices;

/*
 * Given a N*N Matrix.
 * Print the boundry in clockwise fashion.
 */
public class PrintBoundry {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int N = arr.length;
        int i = 0;
        int j = 0;

        for (int x = 0; x < N - 1; x++) {
            System.out.print(arr[i][j] + " "); // 1 2 3
            j++;
        }

        for (int x = 0; x < N - 1; x++) {
            System.out.print(arr[i][j] + " "); // Now here i=0 & j=3
            i++;
        } // 4 8 12

        // Now after iteration i=3 & j=3 (j has not changed)
        for (int x = 0; x < N - 1; x++) {
            System.out.print(arr[i][j] + " ");
            j--;
        }
        // Now i=3 & j=0
        for (int x = 0; x < N - 1; x++) {
            System.out.print(arr[i][j] + " ");
            i--;
        }
    }

}
// Time Complexity : O(N)
