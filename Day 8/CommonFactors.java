public class CommonFactors {
    public static int commonFactors(int a, int b) {
        int gcd = gcd(a, b);
        int count = 0;
        for (int i = 1; i <= gcd; i++) {
            if (a % i == 0 && b % i == 0) count++;
        }
        return count;
    }
    private static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
    public static void main(String[] args) {
        System.out.println(commonFactors(12,6)); // Output: 4
    }
}
