
package Array;

class ArrayDemo1 {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = new int[] { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };
        int N = 10;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                    break;

                }

            }
        }
        System.out.println(count);
    }
}
//Output : 7
// time complexity=O(N*N) & space complexity=O(1)
