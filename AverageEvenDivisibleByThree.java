public class AverageEvenDivisibleByThree {
    public static int averageValue(int[] nums) {
        int sum = 0, count = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,12};
        System.out.println(averageValue(arr)); // Output: 9
    }
}

