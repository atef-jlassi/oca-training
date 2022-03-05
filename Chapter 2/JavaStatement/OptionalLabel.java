public class OptionalLabel {
    public static void main(String...args) {
        int i=10;
        WHILE_LOOP: while(i > 6) {
            if(i==7) {
                break WHILE_LOOP;
            }
            i--;
            System.out.println(i);

        }

        System.out.println("End While Loop");
    }
}