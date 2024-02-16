import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class WordBank {

  public static String getAnswerForPuzzleNumber(int puzzleNumber) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("answers.txt"));
    for (int i = 0; i < puzzleNumber; i++) {
      scanner.next();
    }
    String temp = scanner.next();
    scanner.close();
    return temp;
    
  }


  public static boolean checkInDictionary(String proposed) throws FileNotFoundException {
    File file = new File("dictionary.txt");
    Scanner scan = new Scanner(file);
    String check = "";

    while(scan.hasNext()){
      check = scan.nextLine();
      if(proposed.equals(check)){
        scan.close();
        return true;
      }
    }
    scan.close();
    return false;  
  }
}
