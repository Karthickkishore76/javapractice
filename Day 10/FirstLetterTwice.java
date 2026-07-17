import java.util.HashSet;

public class FirstLetterTwice {
    public static char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) return c;
            seen.add(c);
        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz")); // c
    }
}
