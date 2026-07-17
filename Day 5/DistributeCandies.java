public class DistributeCandies {
    public static int[] distributeCandies(int candies, int numPeople) {
        int[] result = new int[numPeople];
        int i = 0, give = 1;
        while (candies > 0) {
            result[i] += Math.min(give, candies);
            candies -= give;
            give++;
            i = (i + 1) % numPeople;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] res = distributeCandies(10,3);
        for (int r : res) System.out.print(r + " "); // Output: 5 2 3
    }
}
