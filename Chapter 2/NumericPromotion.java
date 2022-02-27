class NumericPromotion {
    public static void main(String ... args) {
    /*
    short x = 14;
    float y = 13.6f;
    float y = 13;
    double z = 30;
    System.out.println(x * y / z);
    */
    int x = 3;
    int y = ++x * 5 / x-- + --x;
    System.out.println("x is "+ x);
    System.out.println("y is "+ y);
    
    }
}
