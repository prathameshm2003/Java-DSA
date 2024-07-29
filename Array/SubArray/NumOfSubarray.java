package SubArray;

/*
 * find the number of subarrays in the given array.
 * Arr : [4,2,10,3,12,-2,15]
 * A:49
 * B:21
 * C:28
 * D:14
 */
public class NumOfSubarray {
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 2, 10, 3, 12, -2, 15 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                count++;

            }

        }
        System.out.println(count++);

    }
}
