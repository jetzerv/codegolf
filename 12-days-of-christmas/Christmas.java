public class Christmas {
    public static void main(String[] a) {
        int x = 0;
        String[] l = new String[]{"A Partridge in a Pear Tree.\n", "Two Turtle Doves, and", "Three French Hens,", "Four Calling Birds,", "Five Gold Rings,", "Six Geese-a-Laying,", "Seven Swans-a-Swimming,", "Eight Maids-a-Milking,", "Nine Ladies Dancing,", "Ten Lords-a-Leaping,", "Eleven Pipers Piping,", "Twelve Drummers Drumming,"};
        for (String d : new String[]{"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth"}) {
            System.out.println("On the "+ d + " day of Christmas\nMy true love sent to me");
            for (int i = 0; i <= x; i++) {
                System.out.println(l[x - i]);
            }
            x++;
        }
    }
}
