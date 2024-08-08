public class swapTwoVariables{
    public static void main(String[] args){
        String x = "water";
        String y = "Kool-Aid";
        String temp;
        // Third Variable is needed to swap the variable values

        // Before Swap
        System.out.println("Before Swap");
        System.out.println("X is : "+x);
        System.out.println("Y is : "+y);

        temp = x;
        x = y;
        y = temp;
        // After Swap
        System.out.println("After Swap");
        System.out.println("X is : "+x);
        System.out.println("Y is : "+y);
    }
}