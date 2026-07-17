public class ChessboardSameColor {
    public static boolean checkTwoChessboards(String coord1, String coord2) {
        int col1 = coord1.charAt(0) - 'a' + 1;
        int row1 = coord1.charAt(1) - '0';
        int col2 = coord2.charAt(0) - 'a' + 1;
        int row2 = coord2.charAt(1) - '0';
        return ((col1 + row1) % 2) == ((col2 + row2) % 2);
    }
    public static void main(String[] args) {
        System.out.println(checkTwoChessboards("a1","c3")); // true
    }
}
