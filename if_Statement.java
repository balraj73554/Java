import java.util.Scanner;
public class if_Statement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("Your are adult");
        }
        else if(age<18 && age>12){
            System.out.println("You are not adult");
        }
        else {
            System.out.println("you are child");
        }

    }
}
