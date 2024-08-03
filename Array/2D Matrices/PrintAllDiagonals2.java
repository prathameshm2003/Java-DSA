package TwoDMatrices;

/*
 * Given a matrix of size N*M
 * print all the diagonal (R->L)
 * Note:- row==> 4th row
   Output : 30 23 16 9 2 
            29 22 15 8 1 
            28 21 14 7 
            27 20 13 
            26 19 
            25 
 */
public class PrintAllDiagonals2 {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 },
                { 25, 26, 27, 28, 29, 30 }
        };
        int N = 5; //rows
        int M = 6; //columns

        for (int j = M - 1; j >= 0; j--) {
            int i = N - 1;
            int y = j;

            while (i >= 0 && y >= 0) {
                System.out.print(arr[i][y] + " ");
                i--;
                y--;
            }

            System.out.println();
        }
    }
}
