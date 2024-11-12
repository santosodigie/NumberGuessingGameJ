import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Welcome to my Number Guessing Game!");
        Random rand = new Random();
        int number = rand.nextInt(1, 11);
        boolean exit = false;

        while(!exit){
            System.out.println("Please guess a number");
            String guess = scanner.nextLine();

            if(Integer.parseInt(guess) == number){
                System.out.println("Congrats you have won ");
                exit = true;
            }
            else{
                System.out.println("Please guess again");
            }
        }
    }
}
