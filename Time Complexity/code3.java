//sum of N natural numbers

package Timecomplexity;

class SumofN {
    static int sum(int num) {
        int add = 0;
        add = num * (num + 1) / 2;
        return add;

    }

    public static void main(String[] args) {
        int num = 10;
        int ret = sum(num);
        System.out.println(ret);
    }

}
