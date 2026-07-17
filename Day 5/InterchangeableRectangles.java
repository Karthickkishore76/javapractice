import java.util.HashMap;

public class InterchangeableRectangles {
    public static long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
        long result = 0;
        for (int[] rect : rectangles) {
            double ratio = (double) rect[0] / rect[1];
            long count = map.getOrDefault(ratio, 0L);
            result += count;
            map.put(ratio, count + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] rects = {{4,8},{3,6},{10,20},{15,30}};
        System.out.println(interchangeableRectangles(rects)); // Output: 6
    }
}
