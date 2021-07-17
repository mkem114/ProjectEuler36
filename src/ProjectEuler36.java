import java.util.stream.Stream;

public class ProjectEuler36 {
    public static void main(String[] args) {
        System.out.println(Stream
                .iterate(1, n -> n + 1)
                .limit(999_999)
                .filter(integer -> integer % 2 == 1)
                .filter(integer -> ifPalindromic(integer.toString()))
                .filter(integer -> ifPalindromic(Integer.toString(integer, 2)))
                .reduce(Integer::sum));
    }

    private static boolean ifPalindromic(final String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
