import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    
    public static WordleGame startGame(Scanner scanner) throws FileNotFoundException {
        
        System.out.println("Which puzzle would you like to attempt? (0-2315)");
        int num = scanner.nextInt();
        WordleGame game = new WordleGame(num);
        return game;  
    }

    
    public static void playGame(Scanner scanner, WordleGame game) throws FileNotFoundException {
       
        while(!game.isGameOver() && !game.isGameWin()){
            System.out.println("Enter Guess");
            String guess = scanner.next();
            System.out.println();

            if(WordBank.checkInDictionary(guess)){
                game.guess(guess);
                System.out.println(game.toString());
                
            }else{
                System.out.println("Invalid Guess");
                System.out.println();
                System.out.println(game.toString());
                System.out.println();
            }
        }
    }

    
    public static void reportGameOutcome(WordleGame game) {
        
        String ans = game.getAnswer();
        if(game.isGameWin()){
            System.out.println("You Win!");
            System.out.println();
        }else if(game.isGameOver()){
            System.out.println("The answer was " + ans);
            System.out.println();
        }
    }

   
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        WordleGame game = startGame(scanner);
        playGame(scanner, game);
        reportGameOutcome(game);
    }
}
