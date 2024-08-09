public class forLoop {
    public static void main(String[] args){
        // For loop
        // for loop (pre-test loop) is used to execute same code again and again until specified condition not setisified or condition became false
        for(int i=0;i<5;i++){
            System.out.println(i);
        }

    // Nested loop
    // the loop inside another loop two or more times is called Nested loop
    for(int j=0;j<5;j++){
        for(int k=0;k<j;k++){
            System.out.printf("* ");
    }
    System.out.println("\n");
    }
    
    }
}
