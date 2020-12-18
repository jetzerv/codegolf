import java.lang.Math;

class LeylandNumbers{
    public static void main(String[] a) {
        for (int i=2,j=2;i<32;i++) {
            System.out.println(Math.pow(i,j)+Math.pow(j,i));
        }
    }
}