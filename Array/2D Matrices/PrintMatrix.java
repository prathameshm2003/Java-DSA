package TwoDMatrices;

/*
 * Iterate through entire matrix row-by-row.
 */
public class PrintMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  //arr.length=3 & arr[i].length=4
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

}
