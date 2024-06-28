import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
 
    // Function that implements the
    // number guessing game
    static int round=1,score=0,points=0;
    public static int guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100 * Math.random());
 
        // Given K trials
        int k = 5;
 
        int i, guess;
 
        System.out.println("A number is chosen between 1 to 100.Guess number within "+k+" trials.");
        System.err.println("==============Now you are in ROUND "+round+"==============");
        // Iterate over K Trials
        for (i = 0; i < k; i++) {
 
            System.out.println(
                "Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                points=10/i+1;
                score+=points;
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("You got "+points+" points.");
                System.out.println("Now your SCORE is "+score);
                while(true)
        		{
            		 System.err.println("Press 1 to go to Another Round OR PRESS 0 KEY TO EXIT GAME!!!");
            		 if (sc.nextInt()==1) 
            		 {
            		     round++;
            			 guessingNumberGame();
            		 }
            		 else{
            		     return 0;
            		 }
            		 
        		}
            }
            else if (number > guess && i != k - 1) {
                System.out.println("The number is greater than " + guess);
                System.err.println("Try Again");
            }
            else if (number < guess && i != k - 1) {
                System.out.println("The number is less than " + guess);
                System.err.println("Try Again");
            }
        }
 
        if (i == k) {
            System.out.println("You have exhausted "+k+" trials.");
            System.out.println("The number was " + number);
            points=0;
            System.out.println("You got "+points+" points.");
            System.out.println("Now your SCORE is "+score);
            System.err.println("Press 1 to Restart the Round OR PRESS 0 KEY TO EXIT GAME!!!");
            if (sc.nextInt()==1) 
            {
            	 guessingNumberGame();
            }
            else{
                return 0;
            }
    
        }
        return 0;
    }
 
    // Driver Code
    public static void main(String arg[])
    {
        System.err.println("!!!NUMBER GUESSING GAME!!!");
		System.err.println("# The system generates a random number from a given range 1 to 100.");
		System.err.println("# You have to enter their given number by guessing it.");
		System.err.println("# The computer then tells if the entered number matches the guesses number or it is greater/less than the generated number.");
		System.err.println("The game continues under the user guessing the number.");
		System.err.println("YOU HAVE 5 ATTEMPTS TO GUESS THE CORRECT NUMBER");
        // Function Call
        guessingNumberGame();
    }
}