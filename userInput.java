// First import Scanner class
import java.util.Scanner;

public class userInput{
    public static void main(String[] args){
        // Create scanner object to user scanner functions
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name : ");
        String name = scanner.nextLine();
        System.out.println("Your name is : "+name);

        System.out.println("Your age : ");
        int age = scanner.nextInt();
        System.out.println("You are "+age+" years old");
        // For user input in new line
        scanner.nextLine();
        System.out.println("Your favorate food");
        String food = scanner.nextLine();
        System.out.println("Your fav food is : "+food);
    }
}