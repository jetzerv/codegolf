public class Beers {
    public static void main(String[] a) {
        String q = "bottle";
        String r = "bottles";
        String s = "%s %s of beer on the wall, %s %s of beer.\n";
        String t = "Take one down and pass it around";
        String u = "Go to the store and buy some more";
        String v = ", %s %s of beer on the wall.\n\n";
        for (int i = 99;i>=0;i--) {
            if (i == 1) {
                System.out.printf(s,i,q,i,q);
                System.out.print(t);
                System.out.printf(v,"no more",r);
            } else if (i == 0) {
                System.out.printf(s,"No more",r,"no more",r);
                System.out.print(u);
                System.out.printf(v,99,r);
            } else {
                System.out.printf(s,i,r,i,r);
                System.out.print(t);
                System.out.printf(v,i-1,(i==2)?q:r);
            }
        }
    }
}