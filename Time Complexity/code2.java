//sqrt of the number

package Timecomplexity;

class SqRoot {
    static int Sqrt(int num) {
        int start = 1;
        int end = num;
        int itr = 0;
        int ans = 0;

        while (start <= num) {
            itr++;
            int mid = (start + end) / 2;
            int sqr = mid * mid;
            if (sqr == num) {
                System.out.println(itr);
                return mid;

            }
            if (sqr > num) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;

            }
        }
        System.out.println(itr);
        return ans;

    }

    public static void main(String[] args) {
        int num = 50;
        int ret = Sqrt(num);
        System.out.println(ret);
    }
}