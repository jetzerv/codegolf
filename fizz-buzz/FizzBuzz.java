class FizzBuzz {
    public static void main(String[] s) {
        for (int i = 1; i < 101; i++) {
            String x = ""+i, f="Fizz",b="Buzz";
            x = (i%3<1) ? f:x;
            x = (i%5<1) ? b:x;
            x = (i%5<1&&i%3<1) ? f+b:x;
            System.out.println(x);
        }
    }
}
