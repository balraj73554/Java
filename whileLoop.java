import java.util.Scanner;
public class whileLoop {
 public static void main(String[] args){
    // While
    // While Loop - (known as pretest loop) is a looping statement the block code of while loop execute again and again until a specific condition not setisified or become false
    // while loop is used when the number of iteration not known before
    Scanner scanner = new Scanner(System.in);
    String name = "";
    while(name.isBlank()){
        System.out.println("Enter Your name : ");
        name = scanner.nextLine();
    }
    System.out.println("Hello "+name);

    // Do While
    // it is same as while loop but the block of code executes atleast once without checking condition (also known as post test loop) and the execute the same code again if condition is true
    String age = "";
    do{
        System.out.println("Enter your age : ");
        age = scanner.nextLine();
    }while(age.isBlank());
    System.out.println("Your age : "+age);
 }   
}
