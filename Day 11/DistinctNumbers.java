public class DistinctNumbers {
    public static int distinctIntegers(int n) {
        return (n == 1) ? 1 : n - 1;
    }
    public static void main(String[] args) {
        System.out.println(distinctIntegers(5)); // Output: 4
    }
}
