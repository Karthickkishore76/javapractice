public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427")); // 35427
        System.out.println(largestOddNumber("4206"));  // ""
    }
}
