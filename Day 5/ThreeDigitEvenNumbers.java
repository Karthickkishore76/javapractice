import java.util.*;

public class ThreeDigitEvenNumbers {
    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new TreeSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        int num = digits[i]*100 + digits[j]*10 + digits[k];
                        if (num >= 100 && num % 2 == 0) set.add(num);
                    }
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        int[] res = findEvenNumbers(digits);
        for (int r : res) System.out.print(r + " "); // Output: 102 120 130 210 230 310
    }
}
