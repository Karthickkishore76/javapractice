public class TotalDistance {
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank > 0) {
            if (mainTank >= 5 && additionalTank > 0) {
                distance += 50;
                mainTank -= 4;
                additionalTank -= 1;
            } else {
                distance += mainTank * 10;
                break;
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        System.out.println(distanceTraveled(50,10)); // Output: 600
    }
}
