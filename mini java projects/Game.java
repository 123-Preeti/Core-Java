import java.util.Scanner;

public class Game {
    
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());//Generating number between 1 and 100

        int K = 10; //Number of attempts 

        System.out.println("Choose a number between 1 and 100" + "\n You have " + K + " attempts to guess the correct number. ");

        
        for (int i =0; i < K ;i++){ //loop for attempts
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            
        if(guess == number ){
            System.out.println("Congratulations! you guessed right number"); 
            sc.close();
            return;
        }
        else if(guess < number) {
            System.out.println( "The number is greater than " + guess);

        }
        else {
            System.out.println("The number is less than "+ guess);
        }
        }

        //attempts over
        System.out.println("Sorry!, Your attempt is over. The correct number was : "+ number );
        sc.close();

    }
    public static void main(String[] args) {
        guessingNumberGame();
    }
}