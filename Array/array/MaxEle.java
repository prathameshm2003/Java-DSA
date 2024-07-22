package Array;

public class MaxEle {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 4, 5, 1, 2, 7, 9, 8 };
        int start = 1; // start index of the range
        int end = 3; // end index of the range
        int maxEle = Integer.MIN_VALUE;

        // Iterate through the range specified by start and end
        for (int x = start; x <= end; x++) {
            if (arr[x] > maxEle) {
                maxEle = arr[x];
            }
        }
        System.out.println("Maximum element in the range [" + start + ", " + end + "] is: " + maxEle);
    }
}
