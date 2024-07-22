package Array;

public class ArrRotationOptimized {

    static int rotateOptimized(int arr[], int size, int x) {
        int k = 1;
        while (k <= x) {
            int last = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = last;
            k++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        rotateOptimized(arr, arr.length, 5);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
