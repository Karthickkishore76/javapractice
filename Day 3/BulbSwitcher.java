public class BulbSwitcher {
    public static int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
    public static void main(String[] args) {
        System.out.println(bulbSwitch(3));  // Output: 1
        System.out.println(bulbSwitch(10)); // Output: 3
    }
}
