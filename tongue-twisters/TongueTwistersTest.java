import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tongue-twisters\n")
public class TongueTwistersTest extends AbstractPrintlnTest {

    @Test
    @DisplayName("Normal Code")
    public void testNormal() {
        TongueTwisters.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    @Test
    @DisplayName("Minified Code")
    public void testMinified() {
        T.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    private String getExpectedData() {
        return "How much wood would a woodchuck chuck,\n" +
                "If a woodchuck could chuck wood?\n" +
                "A woodchuck would chuck all the wood he could chuck\n" +
                "If a woodchuck would chuck wood.\n" +
                "\n" +
                "Peter Piper picked a peck of pickled peppers.\n" +
                "A peck of pickled peppers Peter Piper picked.\n" +
                "If Peter Piper picked a peck of pickled peppers,\n" +
                "Where's the peck of pickled peppers Peter Piper picked?\n" +
                "\n" +
                "She sells seashells by the seashore,\n" +
                "The shells she sells are seashells, I'm sure.\n" +
                "So if she sells seashells on the seashore,\n" +
                "Then I'm sure she sells seashore shells.";
    }

}