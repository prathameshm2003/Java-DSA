package Array;

class ArrayDemo2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };
        int N = 10;
        int count = 0;
        int maxEle = Integer.MIN_VALUE;
        // System.out.println(Integer.MIN_VALUE);

        for (int i = 0; i < N; i++) { // TC==O(N)
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        // count
        for (int i = 0; i < N; i++) { // TC==O(N)
            if (arr[i] == maxEle) {
                count++;
            }
        }
        System.out.println(N - count);
    }
}

// TC : O(N)+ O(N)====O(N)