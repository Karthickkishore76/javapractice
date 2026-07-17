public class PrimeSetBits {
    private static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if (isPrime(bits)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6,10)); // Output: 4
    }
}
