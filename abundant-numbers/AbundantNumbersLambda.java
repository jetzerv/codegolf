import static java.util.stream.IntStream.range;

class AbundantNumbersLambda {
    public static void main(String[] s) {
        range(1, 201)
                .filter(n -> range(1, n)
                        .filter(e -> n % e < 1)
                        .sum() > n)
                .forEach(System.out::println);
    }
}