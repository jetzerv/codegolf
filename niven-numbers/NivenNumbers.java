class NivenNumbers {
    public static void main(String[] a) {
        for (int i = 1; i < 101; i++) {
            int digit1 = i/10;
            int digit2 = i-(digit1*10);
            int sum = digit1+digit2;
            int modulo = i%sum;
            if (modulo < 1) {
                System.out.println(i);
            }
        }
    }
}