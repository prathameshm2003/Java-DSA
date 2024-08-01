package TwoDMatrices;

/*
 * Given a matrix of N*N.
 * Rotate the matrix 90 degree clockwise from the top-right corner.
 * Note : (No-new matrix)
 * 
 * Logic : Do Transpose and then reverse the rows.
 */
public class RotateMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Swap Column i.e reverse
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        // print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

}

// Time Complexity : O(N^2)
