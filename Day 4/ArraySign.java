public class ArraySign {
    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) sign *= -1;
        }
        return sign;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(arr)); // Output: 1
    }
}
