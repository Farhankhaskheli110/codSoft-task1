import java.util.*;
class Number_Game{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println(" WELLCOME TO THE NUMBER GAME ");

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            System.out.println("I HAVE SELECTED A NUMBER BETWEEN " + minRange + " AND " + maxRange + " . Can you guess it ?");
            
            while (attempts < maxAttempts) {
                System.out.print("ENTER YOUR GUESS :");
                int userGuess = ob.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("CONGRATULATIONS ! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                    }else if (userGuess < targetNumber){
                        System.out.println("Too Low. Try Again.");
                        }else {
                            System.out.println("Too High. Try Again.");
                            }            
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
                }
            }//end of whileLoop
            
            System.out.print("Do you want to play another round? (y/n): ");
            String playAgain = ob.next();
            
            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing! Your total score is: " + score);
                break;
            }

        } while (true);

    }//end of main method
}//end of class
