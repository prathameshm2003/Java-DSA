package EquilibriumIndex;

/*
 * Equlibrium index of an array
 *
 * Problem description :
 * -You are given an array A of integers of size N.
 * -Your task is to find the equilibrium index of the given array
 * -The equlibrium index of an array is an index such that the sum of elements at lower indexes
 * is equal to the sum of elements at higher indexes.
 * -If there are no elements that are at lower indexes or at higher indexes,then the corresponding sum of
 * elements is considered as 0.
 *
 * Note :
 * -Array indexes starts from 0.
 * -If there is no equlibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 * Problem Constraint :
 * 1<=N<=105
 * -105<=A[i]<=105
 *
 * Example input:
 * Input 1:
 * A=[-7,1,5,2,-4,3,0]
 * Input 2:
 * A=[1,2,3]
 * Example output:
 * Output 1:
 * 3
 * Output 2:
 * -1
 */
public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = new int[] { -7, 1, 5, 2, -4, 3, 0 };
        int N = arr.length;
        int flag = 0;
        for (int i = 0; i < N; i++) {
            int leftsum = 0;
            int rightsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum = leftsum + arr[j];
            }
            for (int j = i + 1; j < N; j++) {
                rightsum = rightsum + arr[j];
            }

            if (leftsum == rightsum) {
                flag = 1;
                System.out.println(i);
                break;

            }
        }
        if (flag == 0) {
            System.out.println("-1");
        }

    }

}
//Time Complexity == O(N*N)
//Space Complexity == O(1)
