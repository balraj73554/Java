public class stringMethods{
    public static void main(String[] args){
        // String is a reference data type that can store one or more characters 
        // Reference data type have access to useful methods.

        String name = "Ankit";
        // equals -checks string is equal to or not of given string and it is case sensetive
        boolean result1 = name.equals("Ankit");
        System.out.println(result1);

        // equalsIgnoreCase - not case sensetive
        boolean result2 = name.equalsIgnoreCase("ankit");
        System.out.println(result2);

        // charAt - returns character at index
        char resultChar = name.charAt(2);
        System.out.println(resultChar);

        // indexOf - returns index of character
        int resultInt = name.indexOf("k");
        System.out.println(resultInt);

        // isEmpty - checks is string empty or not , return boolean value
        boolean resultBool = name.isEmpty();
        System.out.println(resultBool);

        // Some other useful Methods.....
        // toUpperCase()
        // toLowerCase();
        // trim();
        // replace();
    }
}