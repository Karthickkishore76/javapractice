public class ReverseInteger {
    public static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int)rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));   // Output: 321
        System.out.println(reverse(-123));  // Output: -321
    }
}
