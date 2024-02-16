import java.io.FileNotFoundException;

/**
 * Tester file.
 */
public class Tester {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println(WordBank.checkInDictionary("hello"));  // true
    System.out.println(WordBank.checkInDictionary("asdfg"));  // false

    // System.out.println(WordBank.getAnswerForPuzzleNumber(0)); // bused
    // System.out.println(WordBank.getAnswerForPuzzleNumber(0)); // bused
    // System.out.println(WordBank.getAnswerForPuzzleNumber(1)); // plumb

    // TODO add tests for Wordle Letter

    // WordleLetter test =  new WordleLetter('A');
    // test.setColor("green");
    // System.out.println(test.isColorSet());
    // System.out.println(test.isGreen());

    // TODO add tests for Wordle Game
    WordleGame testgame = new WordleGame(0);
    System.out.println(testgame.getAnswer());
    testgame.guess("tides");
    System.out.println(testgame.getNumberGuessesSoFar());
    testgame.guess("busts");
    System.out.println(testgame.getNumberGuessesSoFar());
    
    // for(int i=0;i<2;i++){
    //   for(int j=0;j<5;j++){
    //     System.out.print(testgame.getGuess(i)[j]);
    //   }
    //   System.out.println();
    // }

    // System.out.println();
    
    // System.out.println();
    testgame.guess("buses");
    System.out.println(testgame.getNumberGuessesSoFar());
    testgame.guess("tries");
    System.out.println(testgame.getNumberGuessesSoFar());
    testgame.guess("buses");
    System.out.println(testgame.getNumberGuessesSoFar());
    testgame.guess("buses");
    System.out.println(testgame.getNumberGuessesSoFar());
    System.out.println(testgame.isGameOver());
    


    // TODO add tests for Main

   
    String result = "";
    // for each word guessed so far
     for (int i = 0; i < testgame.getNumberGuessesSoFar(); i++) {
  
       for (int j = 0; j < 5; j++) {
         result += testgame.getGuess(i)[j];
       }

       result += "\n";
     }    
     System.out.println();
     System.out.println(result);
  }
}
