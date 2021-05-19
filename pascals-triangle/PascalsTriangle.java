
// facts:
// 1. i == length horizontally
// 2. outer numbers are always 1
// 3.
interface PascalsTriangle {
    static void main(String[] s) {
        for (int i = 1; i < 21; i++) {
            String x = "";
            for (int j = 1; j<=(i/2 + 1);j++) {
                x = x + (j +"_");
            }
            for (int j = i-1; j>=0;j--) {
                x = x + (j+1 +" ");
            }
            System.out.println(x);
        }
    }


    // 1 2 1
    // 0 1 2 = len(3)/2= 1(floor)

    // 1 4 6 4 1
    // 0 1 2 3 4 = len(5)/2 = 2(floor)
}
