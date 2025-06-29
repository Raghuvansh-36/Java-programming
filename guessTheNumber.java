import java.util.Random;
import java.util.Scanner;

public class guessTheNumber{

    static class Game{
        int number;
        int noOfGuesses = 0;
        int inputNumber;
        
        void guessNumber(){
            Random rand = new Random();
            this.number = rand.nextInt(100);
        }
        
        void takeInputNumber(){
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter any number between 1 & 100:");
                inputNumber = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        boolean toCheckNumber(){
            noOfGuesses++;
            if(inputNumber == number){
                System.out.format("You guessed the right number.\n Your attempts: %d", noOfGuesses);
                return true;
            }
            else if(inputNumber > number){
                System.out.println("Your number is high...");
            }
            else if(inputNumber < number){
                System.out.println("Your number is low...");
            }
            return false;
        }
        public void setNoOfGuesses(int noOfGuesses) {
            this.noOfGuesses = noOfGuesses;
        }
    }
    
    public static void main(String[] args){
        Game g = new Game();
        g.guessNumber();
        boolean b = false;
        while(!b){
            g.takeInputNumber();
            b = g.toCheckNumber();
        }
    }
}
