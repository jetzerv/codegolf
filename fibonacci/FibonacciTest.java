import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Fibonacci")
public class FibonacciTest extends AbstractPrintlnTest {

    @Test
    @DisplayName("Normal Code")
    public void testNormal() {
        Fibonacci.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    @Test
    @DisplayName("Minified Code")
    public void testMinified() {
        B.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    private String getExpectedData() {
        return "0\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "8\n" +
                "13\n" +
                "21\n" +
                "34\n" +
                "55\n" +
                "89\n" +
                "144\n" +
                "233\n" +
                "377\n" +
                "610\n" +
                "987\n" +
                "1597\n" +
                "2584\n" +
                "4181\n" +
                "6765\n" +
                "10946\n" +
                "17711\n" +
                "28657\n" +
                "46368\n" +
                "75025\n" +
                "121393\n" +
                "196418\n" +
                "317811\n" +
                "514229\n" +
                "832040";
    }

}