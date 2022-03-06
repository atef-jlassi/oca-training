import java.util.*;
public class FinalizeMethod {
    public static void main(String [] args) {
        List<Box> list = new ArrayList<>();
        // for(int i = 0; i <6 ; i++) {
        while(true) {    
            Box b = new Box();
            list.add(b);
        }
    }
}

class Box{
    Box() {
        super();
        System.out.println("this object reference is located on the heap at: "+ this);
    }

    protected void finalize() {
        System.out.println("!!!! Finalized !!! "+ this);
    }
}