import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sierpinski Triangle")
public class SierpinskiTriangleTest extends AbstractPrintlnTest {

    @Test
    @DisplayName("Normal Code")
    public void testNormal() {
        SierpinskiTriangle.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    private String getExpectedData() {
        return "               ?\n" +
                "              ? ?\n" +
                "             ?   ?\n" +
                "            ? ? ? ?\n" +
                "           ?       ?\n" +
                "          ? ?     ? ?\n" +
                "         ?   ?   ?   ?\n" +
                "        ? ? ? ? ? ? ? ?\n" +
                "       ?               ?\n" +
                "      ? ?             ? ?\n" +
                "     ?   ?           ?   ?\n" +
                "    ? ? ? ?         ? ? ? ?\n" +
                "   ?       ?       ?       ?\n" +
                "  ? ?     ? ?     ? ?     ? ?\n" +
                " ?   ?   ?   ?   ?   ?   ?   ?\n" +
                "? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?";
    }
}