//squareroot of the number
package Timecomplexity;

class SqrRoot {
    static int sqrt(int num) {
        int val = 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i * i <= num) {
                val = i;
                count = count + 1;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        int num = 10;
        int ret = sqrt(num);
        System.out.println(ret);
    }
}