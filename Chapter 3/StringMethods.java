public class StringMethods {
    public static void main(String...args) {
        
        String string = "animals";
        // chartAt(int index)
        System.out.println("####charAt()#####");
        System.out.println(string.charAt(0));


        // indexOf()
        System.out.println("####indexOf()#####");    
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a', 4));
        System.out.println(string.indexOf("al", 5));

        // substring()
        System.out.println("####substring()#####");
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3,4));
        System.out.println(string.substring(3,7));
        System.out.println(string.substring(3,string.length()));
        System.out.println(string.substring(3,string.length()-1));
        // System.out.println(string.substring(3,8)); // throw an exception
        // System.out.println(string.substring(3,2)); // throw an exception
        // System.out.println(string.substring(3,3)); // empty string

        // replace()
        System.out.println("####replace()#####");
        String replaceString = "abcabc";
        System.out.println(replaceString.replace('a', 'A'));
        System.out.println(replaceString);
        System.out.println(replaceString.replace("ab", "YYY"));
        System.out.println(replaceString);

        // trim()
        System.out.println("####trim()#####");



    }
}