public class wrapperClass {
    public static void main(String[] args){
        // Wrapper class - provides a way to use primitive data types as reference data types 
        // Reference data type contain useful methods, can be used with colections i.e - ArrayList<>
        // Primitive                    Wrapper
        // boolean                      Boolean
        // char                         Character
        // int                          Integer
        // double                       Double
                
        // autoboxing - the automatic conversion that java compiler makes between the primitive type and their corresponding object wrapper class
            Boolean a = true;
            Character b = '@';
            Integer c = 123;
            Double d = 32.52;
            boolean result = b.equals('@');
            System.out.println(result);

        // unboxing - the reverse of autoboxing. Automatic conversion of wrapper class to primitive
            if(a==true){
                System.out.println("This is true");
            }
    }
}
