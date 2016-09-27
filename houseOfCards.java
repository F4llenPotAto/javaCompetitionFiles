import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class houseOfCards {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(new File("cards.dat"));
    int numbOfDecks = sc.nextInt();
    int caseNum = sc.nextInt();  
    int totalCardCount = 52 * numbOfDecks;

    for(int i = 0; i < caseNum; i ++){
       	int height = sc.nextInt();
    	int totalNumber = (2*((3*height)+1))/2
	numberOfTowers = totalCardCount/numCardsNeeded;
	out.println(numberOfTowers);
    }
  }
}
