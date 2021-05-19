// thoughts:
// 1. Only numbers 1, 2 and 3 are occurring in the sequence.
// 2. Every line describes the previous line
class LookAndSay {
    public static void main(String[] a) {
        String number = "1";
        for (int i = 1; i < 21; i++) {
            System.out.println(number);
            number = lookAndSay(number);
        }
    }

    public static String lookAndSay(final String number) {
        StringBuilder newNumberBuilder = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int count = 1; // init with 1, because there is always 1 char found.

            // make sure there is a next char AND make sure the NEXT number is EQUAL to the current.
            while (i + 1 < number.length() && number.charAt(i) == number.charAt(i + 1)) {
                count++; // Next one is EQUAL, meaning +1
                i++; // Since we've already found the next one to be equal, we want to avoid reprocessing this entry. so SKIP.
            }
            newNumberBuilder.append(count).append(number.charAt(i));
        }

        return newNumberBuilder.toString();
    }
}