class BinaryOperators {

    public static void main(String ... args) {
       
        // DOES NOT COMPILE
        // COMPILE
        int x = (int)1.0; 
        short y = (short) 1921222;
        int z = (int) 9l;
        long t = 192301398193810323L;
        int b = (int) 192301398193810323L;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
        System.out.println(b);
    }
}