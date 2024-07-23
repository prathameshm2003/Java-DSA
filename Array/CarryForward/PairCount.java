package CarryForward;

/*
 * Given an character array(lowercase)
 * Return the count of pair(i,j) such that
 * a) i<j
 * b) arr[i]='a'
 *    arr[j]='g'
 * 
 * Arr : [a,b,e,g,a,g]
 * output : 3
 */
//Bruteforce approch
public class PairCount {
    public static void main(String[] args) {
        char arr[] = new char[] { 'a', 'b', 'e', 'g', 'a', 'g' };
        int count = 0;
        int itr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 'a' && arr[j] == 'g') {
                    count++;

                }
                itr++;
            }

        }
        System.out.println(count);
        System.out.println(itr);
    }

}
// TC : O(N*N)
// SC : O(1)
