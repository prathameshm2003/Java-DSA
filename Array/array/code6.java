package Array;

// Reverse array
class ArrayDemo5 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        int N = arr.length;
        int i = 0;
        int j = N - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--; // Decrease j instead of increasing it
        }

        // Print the reversed array
        for (int k = 0; k < N; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
// TC===O(N) & SC==O(1)
