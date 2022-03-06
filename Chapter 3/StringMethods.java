public class StringMethods {
    public static void main(String...args) {
        
        String string = "animals";

        // chartAt(int index)
        System.out.println(string.charAt(0));



        System.out.println("####indexOf()");
    
        // indexOf()
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a', 4));
        System.out.println(string.indexOf("al", 5));
       
    }
}