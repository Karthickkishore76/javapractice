public class DelayedArrival {
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
    public static void main(String[] args) {
        System.out.println(findDelayedArrivalTime(13, 11)); // Output: 0
    }
}

