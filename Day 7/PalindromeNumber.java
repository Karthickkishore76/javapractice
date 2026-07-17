public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(-121)); // false
    }
}
