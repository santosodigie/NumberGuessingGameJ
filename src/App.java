import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Welcome to my Number Guessing Game!");
        Random rand = new Random();
        int number = rand.nextInt(1, 11);
        boolean exit = false;
        System.out.println(number);

        // while(!exit){
        //     System.out.println("Please guess a number");
        // }
    }
}
