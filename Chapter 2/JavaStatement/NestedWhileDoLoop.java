public class NestedWhileDoLoop {
    public static void main(String...args) {

        int x = 20;
        OUTER_LOOP: while(x>0) {
            INNER_LOOP: do {
                x-=2;
            } while(x>5);
            x--;
            System.out.print(x+"\t");
        }
    }
}