public class code {
    public static void main(String[] a) {
        for(String s : a) {
            int i = Integer.parseInt(s);
            String h = "hundred";
            String[] t = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String[] n = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

            if (i == 0) {
                x("zero");
                continue;
            }
            if (i == 1000) {
                x("one thousand");
                continue;
            }
            if (i % 100 == 0) {
                x(n[y(s, 0, 1)] + " "+h);
                continue;
            }
            if (i > 99) {
                System.out.print(n[y(s, 0, 1)] + " "+h + ((i%100 != 0) ? " and ":""));
            }

            s= (i>99) ? s.substring(1): s;
            i= Integer.parseInt(s);
            if (i > 0 && i < 20) {
                x(n[i]);
            } else if (i % 10 == 0 && i != 0) {
                x(t[y(s, 0, 1)]);
            } else if (i > 0) {
                System.out.print(t[y(s, 0, 1)]);
                if (i%10 != 0) System.out.print("-"+ n[y(s, 1, 2)]+ "\n");
            }
        }
    }

    static int y(String s, int i, int j) {
        return Integer.parseInt(s.substring(i,j));
    }
    static void x(String s) {
        System.out.println(s);
    }
}
