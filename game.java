import java.util.Scanner;

public class game {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 10) + 1;
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 10.");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the secret number " + secretNumber + " in " + attempts + " attempts!");
            }
        }

        scanner.close();
    }
}

