public class Array {
    public static void main(String[] args) {
        // Arrray - array is a variable 
        String[] food = {"Apple","Banana","Papaya"};
        // Printing array item
        System.out.println(food[0]);
        // Updating array
        food[2] = "Gawava";
        System.out.println(food[2]);
        // Array traversing - when all the items of array accessed one by one is called traversing
        for(int i=0;i<food.length;i++){
            System.out.println(food[i]);
        }
    }
}
