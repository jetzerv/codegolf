class PrimeNumbers {
    public static void main(String[] a) {
        for (int i = 2; i < 101; ++i) {
            printIfPrime(i);
        }
    }

    public static void printIfPrime(final int n) {
        if (isPrime(n)) {
            System.out.println(n);
        }
    }

    public static boolean isPrime(final int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && i != n) {
                return false;
            }
        }
        return true;
    }
}