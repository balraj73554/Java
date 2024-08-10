  import java.util.*;
public class arrayList {
    public static void main(String[] args){
        // ArrayList - a resizable array. Elements can be added and removed after compilation phase or at run time, store reference datatype.
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("hotdog");
        food.add("hamburger");

        // set value at specific index
        food.set(0,"pasta");

        // remove value form specific index
        food.remove(2);
        
        // Clear full list
        // food.clear();

        
        for(int i = 0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
