public class CoinGame {
    public static String winningPlayer(int x, int y) {
        return (x % 2 == 0 && y % 2 == 0) ? "Bob" : "Alice";
    }
    public static void main(String[] args) {
        System.out.println(winningPlayer(2,3)); // Alice
    }
}
