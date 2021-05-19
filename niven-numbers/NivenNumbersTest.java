import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Niven Numbers")
public class NivenNumbersTest extends AbstractPrintlnTest {

    @Test
    @DisplayName("Normal Code")
    public void testNormal() {
        NivenNumbers.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    @Test
    @DisplayName("Minified Code")
    public void testMinified() {
        N.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    private String getExpectedData() {
        return "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "12\n" +
                "18\n" +
                "20\n" +
                "21\n" +
                "24\n" +
                "27\n" +
                "30\n" +
                "36\n" +
                "40\n" +
                "42\n" +
                "45\n" +
                "48\n" +
                "50\n" +
                "54\n" +
                "60\n" +
                "63\n" +
                "70\n" +
                "72\n" +
                "80\n" +
                "81\n" +
                "84\n" +
                "90\n" +
                "100";
    }

}