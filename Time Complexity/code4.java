package Timecomplexity;

//difference between two number
class Count {
    static int nCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;
        }

        return end - start + 1; // [a,b]==>b-a+1

    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int ret = nCount(num1, num2);
        System.out.println(ret);
    }
}