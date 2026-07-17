public class MaxKSum {
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        while (k > 0 && numOnes > 0) {
            sum += 1;
            numOnes--; k--;
        }
        while (k > 0 && numZeros > 0) {
            numZeros--; k--;
        }
        while (k > 0 && numNegOnes > 0) {
            sum -= 1;
            numNegOnes--; k--;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3,2,0,2)); // Output: 2
    }
}
