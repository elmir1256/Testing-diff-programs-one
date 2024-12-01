import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    StringUtils stringUtils = new StringUtils();

    @Test
    public void reverseStringTest(){
        String result = stringUtils.reverse("olleh");
        Assertions.assertEquals("hello", result);
    }

    @Test
    public void isPalindromeTest(){
        Boolean result = stringUtils.isPalindrome("azzz");
        Assertions.assertEquals(false, result);
    }
}
