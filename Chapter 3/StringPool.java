public class StringPool {

    public static void main(String...args) {

        String name = "Atef";
        String anotherName = "Atef";

        String thirdName = new String("Atef");

        System.out.println(name==anotherName);
        System.out.println(name==thirdName);

        addMoneyToAccound(name, 500);

        System.out.println(name);


    }

    public static void addMoneyToAccound(String accountHolder, int moneyToAdd) {
            // Validations
            
            // Operations
            accountHolder = "Jhon";
    }
}