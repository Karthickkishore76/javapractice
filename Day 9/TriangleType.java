public class TriangleType {
    public static String triangleType(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) return "Not a Triangle";
        if (a == b && b == c) return "Equilateral";
        if (a == b || b == c || a == c) return "Isosceles";
        return "Scalene";
    }
    public static void main(String[] args) {
        System.out.println(triangleType(3,3,3)); // Equilateral
        System.out.println(triangleType(3,4,5)); // Scalene
    }
}
