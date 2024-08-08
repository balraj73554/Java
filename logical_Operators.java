public class logical_Operators {
    public static void main(String[] args){
        int temp = 20;
        // AND (&&) - if both conditions will be true then run the block of code 
        if(temp>20 && temp<25){
            System.out.println("moderate temprature");
        }
        // OR (||) - if any one from both will be true the run the block of code
        else if(temp>30 || temp <40){
            System.out.println("hot weather");
        }
        
        // NOT (!) - only works on String - it shows that if name is not equal to "Rohit" the show this
        String name = "RohitR";
        if(!name.equals("Rohit")){
            System.out.println("Name not Match");
        }

    }
}
