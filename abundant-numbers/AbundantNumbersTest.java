import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Abundant Numbers")
public class AbundantNumbersTest extends AbstractPrintlnTest {

    @Test
    @DisplayName("Normal Code")
    public void testNormal() {
        AbundantNumbers.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    @Test
    @DisplayName("Minified Code")
    public void testMinified() {
        A.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    @Test
    @DisplayName("Lambda Code")
    public void testLambda() {
        AbundantNumbersLambda.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    private String getExpectedData() {
        return "12\n" +
                "18\n" +
                "20\n" +
                "24\n" +
                "30\n" +
                "36\n" +
                "40\n" +
                "42\n" +
                "48\n" +
                "54\n" +
                "56\n" +
                "60\n" +
                "66\n" +
                "70\n" +
                "72\n" +
                "78\n" +
                "80\n" +
                "84\n" +
                "88\n" +
                "90\n" +
                "96\n" +
                "100\n" +
                "102\n" +
                "104\n" +
                "108\n" +
                "112\n" +
                "114\n" +
                "120\n" +
                "126\n" +
                "132\n" +
                "138\n" +
                "140\n" +
                "144\n" +
                "150\n" +
                "156\n" +
                "160\n" +
                "162\n" +
                "168\n" +
                "174\n" +
                "176\n" +
                "180\n" +
                "186\n" +
                "192\n" +
                "196\n" +
                "198\n" +
                "200";
    }

}