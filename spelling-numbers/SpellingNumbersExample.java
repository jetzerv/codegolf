import java.util.Random;

public class SpellingNumbersExample {
    public static void main(String[] a) {
        final Random randomGenerator = new Random();
        final String[] numbers = new String[10];
        for (int counter = 0; counter < 10; counter++) {
            numbers[counter] = String.valueOf(randomGenerator.nextInt(1000));
        }

        System.out.println("\n## Input Numbers ##");
        System.out.println(String.join(", ", numbers));

        System.out.println("\n## Spelling Numbers ##");
        Beers.main(numbers);

        System.out.println("\n## Spelling Numbers Minimal ##");
        BeersMin.main(numbers);
    }
}
