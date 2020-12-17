import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Spelling Numbers")
public class SpellingNumbersTest extends AbstractPrintlnTest {

    @Test
    @DisplayName("Normal Code")
    public void testNormal() {
        SpellingNumbers.main(getInput());
        assertPrintlnWith(getExpectedData());
    }

    @Test
    @DisplayName("Minified Code")
    public void testMinified() {
        SpellingNumbersMin.main(getInput());
        assertPrintlnWith(getExpectedData());
    }

    private String[] getInput() {
        return new String[]{"1","862","998","14","3","11","16","38","9","995","975","681","20","407","7","73","12","13","991","17","94","58","5","990","999","996","8","790","10","993","6","18","4","66","15","187","0","2","994","997","386","44","19","200","1000","992","549","81"};
    }

    private String getExpectedData() {
        return "one\n" +
                "eight hundred and sixty-two\n" +
                "nine hundred and ninety-eight\n" +
                "fourteen\n" +
                "three\n" +
                "eleven\n" +
                "sixteen\n" +
                "thirty-eight\n" +
                "nine\n" +
                "nine hundred and ninety-five\n" +
                "nine hundred and seventy-five\n" +
                "six hundred and eighty-one\n" +
                "twenty\n" +
                "four hundred and seven\n" +
                "seven\n" +
                "seventy-three\n" +
                "twelve\n" +
                "thirteen\n" +
                "nine hundred and ninety-one\n" +
                "seventeen\n" +
                "ninety-four\n" +
                "fifty-eight\n" +
                "five\n" +
                "nine hundred and ninety\n" +
                "nine hundred and ninety-nine\n" +
                "nine hundred and ninety-six\n" +
                "eight\n" +
                "seven hundred and ninety\n" +
                "ten\n" +
                "nine hundred and ninety-three\n" +
                "six\n" +
                "eighteen\n" +
                "four\n" +
                "sixty-six\n" +
                "fifteen\n" +
                "one hundred and eighty-seven\n" +
                "zero\n" +
                "two\n" +
                "nine hundred and ninety-four\n" +
                "nine hundred and ninety-seven\n" +
                "three hundred and eighty-six\n" +
                "forty-four\n" +
                "nineteen\n" +
                "two hundred\n" +
                "one thousand\n" +
                "nine hundred and ninety-two\n" +
                "five hundred and forty-nine\n" +
                "eighty-one";
    }

}