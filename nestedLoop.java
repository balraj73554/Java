public class nestedLoop{
    public static void main(String[] args){
        // Nested Loop - Nested loop is a loop inside another loop 
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}