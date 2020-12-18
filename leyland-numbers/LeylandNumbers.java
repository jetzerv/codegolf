import java.util.*;

class LeylandNumbers {
    public static void main(String[] s) {
        List<Long> a = new ArrayList<>();
        for (int x = 2; x < 37; x++) {
            for (int y = 2; y <= x; y++) {
                long v = (long)(Math.pow(x, y) + Math.pow(y, x));
                a.add(v);
            }
        }
        Collections.sort(a);
        a.stream().filter(i -> i<100_000_000_000L).forEach(System.out::println);
    }
}