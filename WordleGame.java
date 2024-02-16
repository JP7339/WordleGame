import java.io.FileNotFoundException;

public class WordleGame {
  
  private String pNumAns;
  private char[] anschar = new char[5];
  private String guess;
  private char[] guessChar = new char[5];
  private WordleLetter[] wordGuess = new WordleLetter[5];
  private int guesses;
  private WordleLetter[][] wordGuesses = new WordleLetter[6][5];

  public WordleGame(int puzzleNumber) throws FileNotFoundException{
    this.pNumAns = WordBank.getAnswerForPuzzleNumber(puzzleNumber); 
    this.guesses = 0;
    for(int i=0;i<5;i++){
     this.anschar[i] = this.pNumAns.charAt(i);
    }
  }

  public String getAnswer(){
    return this.pNumAns;
  }

  public void guess(String guessWord){   
    for(int i=0;i<5;i++){
      this.guessChar[i] = guessWord.charAt(i);
      WordleLetter guessLet = new WordleLetter(guessWord.charAt(i));
      this.wordGuess[i] = guessLet;
    }

    for(int i=0;i<5;i++){
      if(this.guessChar[i] == (this.anschar[i])){
        this.wordGuess[i].setColor("green");
      }else if(this.guessChar[i] == this.anschar[0] && !this.wordGuess[i].isGreen()){
        this.wordGuess[i].setColor("yellow");
      }else if(this.guessChar[i] == (this.anschar[1])&& !this.wordGuess[i].isGreen()){
        this.wordGuess[i].setColor("yellow");
      }else if(this.guessChar[i] == (this.anschar[2])&& !this.wordGuess[i].isGreen()){
        this.wordGuess[i].setColor("yellow");
      }else if(this.guessChar[i] == (this.anschar[3])&& !this.wordGuess[i].isGreen()){
        this.wordGuess[i].setColor("yellow");
      }else if(this.guessChar[i] == (this.anschar[4])&& !this.wordGuess[i].isGreen()){
        this.wordGuess[i].setColor("yellow");
      }else{
        this.wordGuess[i].setColor("red");
      }
    }
    
    for(int j=0;j<5;j++){
      this.wordGuesses[this.guesses][j]=this.wordGuess[j];
    }
    this.guess = guessWord;
    this.guesses++;    
  }

  public int getNumberGuessesSoFar(){
    return this.guesses;
  }

  public WordleLetter[] getGuess(int guessNumber){
    return this.wordGuesses[guessNumber];
  }

  public boolean isGameOver(){
    if(this.guesses>=6){
      return true;
    }
    if(this.guess==null){
      
      return false;
    }
    if(this.guess.equals(this.pNumAns)){
      return true;
    }
    return false;
  }

  public boolean isGameWin(){
    if(this.guess==null){
      return false;
    }
    if(this.guess.equals(this.pNumAns)){
      return true;
    }
    return false;
  }
  


  public String toString() {
    String result = "";
     for (int i = 0; i < getNumberGuessesSoFar(); i++) {
       for (int j = 0; j < 5; j++) {
         result += getGuess(i)[j];
       }
       
       result += "\n";
     }
    return result;
  }
}
