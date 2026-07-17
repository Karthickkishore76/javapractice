public class ChessboardSquare {
    public static boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '0';
        return (col + row) % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1")); // false (black)
        System.out.println(squareIsWhite("h3")); // true (white)
    }
}
