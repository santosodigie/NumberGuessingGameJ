import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Welcome to my Number Guessing Game!");
        Random rand = new Random();
        int number = rand.nextInt(1, 11);
        boolean exit = false;
        int count = 0;

        while(!exit){
            System.out.println("Please guess a number");
            String guess = scanner.nextLine();
            //System.out.println("Count: " + count);
            count++;

            if(Integer.parseInt(guess) == number){
                System.out.println("Congrats you have won. It took you " + count + " tries");
                exit = true;
            }
            else if(Integer.parseInt(guess) > number){
                System.out.println("Please guess lower");
            }
            else if(Integer.parseInt(guess) < number){
                System.out.println("Please guess higher");
                System.out.println("____________________________________");
            }
            else{
                System.out.println("Please enter a valid number");
            }
        }
    }
}
