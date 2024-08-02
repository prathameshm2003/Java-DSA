package TwoDMatrices;

/*
 * Iterate through entire matrix column-by-column.
 */
public class PrintMatrix2 {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        for (int i = 0; i < arr[0].length; i++) { //arr[0].length=4
            for (int j = 0; j < arr.length; j++) { //arr.length=3
                System.out.print(arr[j][i] + " ");

            }
            System.out.println();
        }
    }

}
