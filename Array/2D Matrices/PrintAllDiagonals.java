package TwoDMatrices;

/*
 * Given a matrix of size N*M
 * print all the diagonal (R->L)
 * Note:- row==> 0th row
   Output : 6 11 16 21 26
            5 10 15 20 25
            4 9 14 19
            3 8 13
            2 7 
            1
 */
public class PrintAllDiagonals {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };
        int N = 5;
        int M = 6;
        for (int j = M - 1; j >= 0; j--) {
            int i = 0;
            int y = j;

            while (i < N && y >= 0) {
                System.out.print(arr[i][y] + " ");
                i++;
                y--;
            }

            System.out.println();
            /*
             * for(;i<N && y>=0;i++,y--){
             * System.out.println(arr[i][y]+" ");
             * }
             * System.out.println();
             */
        }

    }
}
// Time Complexity : O(N*M)
// Space Complexity : O(1)
