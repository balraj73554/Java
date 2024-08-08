public class mathClass{
    public static void main(String[] args){
        double x = 2.66;
        double y = -23;

        // To get Higher and lower value
        double n = Math.max(x,y);
        System.out.println("max : "+n);
        double n2= Math.min(x,y);
        System.out.println("min : "+n2);

        // To get Absolute value
        double abs = Math.abs(y);
        System.out.println("Absolute : "+abs);

        // Squaroot - to get squaroot of a value
        double snum = 25;
        double sqrt = Math.sqrt(snum);
        System.out.println("Squaroot : "+sqrt);

        // Round - rounds the number ceil or floor
        double rond = Math.round(x);
        System.out.println("Round : "+rond);

        // Ceil - rounds the number to higher value
        double cil = Math.ceil(x);
        System.out.println("Ceil : "+cil);

        // Floor - rounds the number to lower value
        double flor = Math.floor(x);
        System.out.println("Floor : "+flor);


    }
}