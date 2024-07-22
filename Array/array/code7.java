package Array;

import java.util.Scanner;

class ArrayDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start : ");
        int start = sc.nextInt();
        System.out.print("End : ");
        int end = sc.nextInt();

        int arr[] = new int[] { 2, 5, 3, 11, 7, 9, 4 };
        int N = 6;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}
