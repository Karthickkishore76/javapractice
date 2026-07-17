public class AccountBalance {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = (purchaseAmount + 5) / 10 * 10;
        return 100 - rounded;
    }
    public static void main(String[] args) {
        System.out.println(accountBalanceAfterPurchase(15)); // Output: 80
        System.out.println(accountBalanceAfterPurchase(9));  // Output: 90
    }
}
