// for-each - traversing technique to iterate through the elements in an Array/Collection.Less steps,more readable, less Flexible

import java.util.ArrayList;

public class forEachLoop {
 public static void main(String[] args){
    String[] animals = {"Cat","Dog","Rat"};
    // :(colon) represents in, means i in animals
    for(String i: animals){
        System.out.println(i);
    }

    // With ArrayList
    ArrayList<String>Animals = new ArrayList<>();
     Animals.add("Tiger");
     Animals.add("Bear");
     Animals.add("Monkey");

     for(String i: Animals){
        System.out.println(i);
     }

 }   
}
