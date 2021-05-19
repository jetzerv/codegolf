class SierpinskiTriangle {
    public static void main(String[] a) {
        drawSierpinskiTriangle();
    }

    public static void drawSierpinskiTriangle() {
        for (int y = 0; y < 16; y++) {
            String line = "";
            for (int x = 16; x > 0; x--) {
                line+= (true) ? "."+y*x+"." : "x"; // todo: find out when to write an `?` or `blank`...
            }
            System.out.println(line);
        }
    }
}