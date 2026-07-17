public class DigitGame {
    public static boolean canAliceWin(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int num : nums) {
            if (num < 10) sum1 += num;
            else sum2 += num;
        }
        return sum1 != sum2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,12};
        System.out.println(canAliceWin(arr)); // true
    }
}
