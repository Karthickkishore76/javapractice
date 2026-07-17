public class CategorizeBox {
    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = (length >= 10000 || width >= 10000 || height >= 10000 || 
                         (long)length * width * height >= 1000000000);
        boolean heavy = mass >= 100;
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
    public static void main(String[] args) {
        System.out.println(categorizeBox(1000,1000,1000,50)); // Bulky
    }
}
