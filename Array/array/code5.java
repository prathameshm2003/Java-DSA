/*
 * Given an array of size N. Return the count of pairs(i,j) with Arr[i]+Arr[j]=K
 * Arr:[3,5,1,-3,7,8,15,6,13]
 * N:10
 * K:10
 */

package Array;

class ArrayDemo4 {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 5, 2, 1, -3, 7, 8, 15, 6, 13 };
        int N = 10;
        int K = 10;
        int count = 0;
        int itr = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                itr++;
                if (arr[i] + arr[j] == K && i != j) {
                    count++;
                }
            }
        }
        System.out.println(itr);
        System.out.println(count * 2);

    }

}
// TC===O(N*N)
