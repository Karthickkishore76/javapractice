public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = empty % numExchange + newBottles;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3)); // Output: 13
    }
}
