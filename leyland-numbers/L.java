// #231 ::
import java.util.*;interface L{static void main(String[]s){Set<Long>a=new TreeSet();for(long x=2,y,v;x<37;x++){for(y=2;y<=x;y++){v=(long)(Math.pow(x,y)+Math.pow(y,x));if(v<Math.pow(17,9))a.add(v);}}a.forEach(System.out::println);}}

/*
import java.util. * ;
interface L {
    static void main(String[] s) {
        Set<Long> a = new TreeSet();
        for (long x = 2, y, v; x < 37; x++) {
            for (y = 2; y <= x; y++) {
                v = (long)(Math.pow(x, y) + Math.pow(y, x));
                if(v < Math.pow(17,9)) a.add(v);
            }
        }
        a.forEach(System.out::println);
    }
}
*/
