public class MoveChips {
    public static int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int p : position) {
            if (p % 2 == 0) even++;
            else odd++;
        }
        return Math.min(even, odd);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(minCostToMoveChips(arr)); // Output: 1
    }
}
