import org.jetbrains.annotations.NotNull;

public class StringUtils {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }
}
