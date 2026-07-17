public class PassThePillow {
    public static int passThePillow(int n, int time) {
        int cycle = (n - 1) * 2;
        int pos = time % cycle;
        return pos < n ? pos + 1 : cycle - pos + 1;
    }
    public static void main(String[] args) {
        System.out.println(passThePillow(4,5)); // Output: 2
    }
}
