public class DifferenceSum {
    public static int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,15,6,3};
        System.out.println(differenceOfSum(arr)); // Output: 9
    }
}
