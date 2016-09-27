import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class houseOfCards {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(new File("cards.dat"));
    int deckNumb = sc.nextInt();
    int cases = sc.nextInt();
    int totalNumCards = deckNumb * 52;
    int numberOfTowers = 0;
    int cardsNeeded = 0;

    for(int i = 0; i < cases; i ++){
       	int height = sc.nextInt();
    		for(int j =0; j < height; j ++){
    			cardsNeeded+=((3*j)-1);
    		}
    numberOfTowers = totalNumCards/cardsNeeded;
	out.println(numberOfTowers);
	numberOfTowers =0;
	cardsNeeded = 0;
    }
  }
}
