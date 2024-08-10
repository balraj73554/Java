// 2D ArrayList - a dynamic list of lists. You can change the size of these lists during runtime.
import java.util.*;
public class _2DArrayList{
    public static void main(String[] args){
        ArrayList<String>bakery = new ArrayList<>();
        bakery.add("Biscit");
        bakery.add("Fries");
        
        ArrayList<String>drinks = new ArrayList<>();
        drinks.add("Soda");
        drinks.add("Coffee");
        drinks.add("Tea");
        
        ArrayList<ArrayList<String>>groceryList = new ArrayList<>();
        groceryList.add(bakery); 
        groceryList.add(drinks);
        // Printing 2D ArrayList
        System.out.println(groceryList); 

        // getting single list
        System.out.println(groceryList.get(0));

        // getting single element of a list
        System.out.println(groceryList.get(1).get(2));

    }
}