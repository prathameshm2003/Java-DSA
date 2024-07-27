package SubArray;

/*  Subarray : 
 * -Given an integer array of size N.
 * -return the length of the smallest subarray which contains both the maxmimum of the array and the minimun of array.
 */
public class SubArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 1, 3, 4, 6, 4, 6, 3 };
        int length = 0;
        int minLength = Integer.MAX_VALUE;
        int MaxEle = Integer.MIN_VALUE;
        int MinEle = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < MinEle) {
                MinEle = arr[i];

            }
            if (arr[i] > MaxEle) {
                MaxEle = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == MinEle) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == MaxEle) {
                        length = j - i + 1;
                        if (minLength > length) {
                            minLength = length;

                        }
                    }
                }
            } else if (arr[i] == MaxEle) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == MinEle) {
                        length = j - i + 1;
                        if (minLength > length) {
                            minLength = length;

                        }
                    }
                }
            }
        }
        System.out.println(minLength);

    }
}

// Time Complexity == O(N*N)
