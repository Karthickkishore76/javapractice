public class CircleCuts {
    public static int numberOfCuts(int n) {
        if (n == 1) return 0;
        return (n % 2 == 0) ? n / 2 : n;
    }
    public static void main(String[] args) {
        System.out.println(numberOfCuts(4)); // Output: 2
        System.out.println(numberOfCuts(3)); // Output: 3
    }
}
