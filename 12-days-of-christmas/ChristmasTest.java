import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("12 Days of Christmas")
public class ChristmasTest extends AbstractPrintlnTest {

    @Test
    @DisplayName("Normal Code")
    public void testNormal() {
        Christmas.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    @Test
    @DisplayName("Minified Code")
    public void testMinified() {
        ChristmasMin.main(new String[]{});
        assertPrintlnWith(getExpectedData());
    }

    private String getExpectedData() {
        return "On the First day of Christmas\n" +
                "My true love sent to me\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Second day of Christmas\n" +
                "My true love sent to me\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Third day of Christmas\n" +
                "My true love sent to me\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Fourth day of Christmas\n" +
                "My true love sent to me\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Fifth day of Christmas\n" +
                "My true love sent to me\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Sixth day of Christmas\n" +
                "My true love sent to me\n" +
                "Six Geese-a-Laying,\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Seventh day of Christmas\n" +
                "My true love sent to me\n" +
                "Seven Swans-a-Swimming,\n" +
                "Six Geese-a-Laying,\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Eighth day of Christmas\n" +
                "My true love sent to me\n" +
                "Eight Maids-a-Milking,\n" +
                "Seven Swans-a-Swimming,\n" +
                "Six Geese-a-Laying,\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Ninth day of Christmas\n" +
                "My true love sent to me\n" +
                "Nine Ladies Dancing,\n" +
                "Eight Maids-a-Milking,\n" +
                "Seven Swans-a-Swimming,\n" +
                "Six Geese-a-Laying,\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Tenth day of Christmas\n" +
                "My true love sent to me\n" +
                "Ten Lords-a-Leaping,\n" +
                "Nine Ladies Dancing,\n" +
                "Eight Maids-a-Milking,\n" +
                "Seven Swans-a-Swimming,\n" +
                "Six Geese-a-Laying,\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Eleventh day of Christmas\n" +
                "My true love sent to me\n" +
                "Eleven Pipers Piping,\n" +
                "Ten Lords-a-Leaping,\n" +
                "Nine Ladies Dancing,\n" +
                "Eight Maids-a-Milking,\n" +
                "Seven Swans-a-Swimming,\n" +
                "Six Geese-a-Laying,\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.\n" +
                "\n" +
                "On the Twelfth day of Christmas\n" +
                "My true love sent to me\n" +
                "Twelve Drummers Drumming,\n" +
                "Eleven Pipers Piping,\n" +
                "Ten Lords-a-Leaping,\n" +
                "Nine Ladies Dancing,\n" +
                "Eight Maids-a-Milking,\n" +
                "Seven Swans-a-Swimming,\n" +
                "Six Geese-a-Laying,\n" +
                "Five Gold Rings,\n" +
                "Four Calling Birds,\n" +
                "Three French Hens,\n" +
                "Two Turtle Doves, and\n" +
                "A Partridge in a Pear Tree.";
    }

}