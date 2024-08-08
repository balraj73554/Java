// to use random function it shold be imported first
import java.util.Random;
public class randomNum {
    public static void main(String[] args){
        // first create the object of random class
        Random random = new Random();
        int num = random.nextInt();
        System.out.println(num);

        // we can generate custom random number 
        int num2 = random.nextInt(5);
        System.out.println(num2);
        // it will generate random number between 0 to 4
        // to get 5th number we can do like this 
        int num3 = random.nextInt(5)+1;
        System.out.println(num3);
    }
}
