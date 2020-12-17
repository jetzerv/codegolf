import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractPrintlnTest {

    final PrintStream standardOut = System.out;
    final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    String fixLineSeparators(final String s) {
        return s.trim().replaceAll("\\n|\\r\\n", System.getProperty("line.separator"));
    }

    void assertPrintlnWith(final String expectedOutput) {
        Assertions.assertEquals(fixLineSeparators(expectedOutput), fixLineSeparators(outputStreamCaptor.toString()));
    }
}