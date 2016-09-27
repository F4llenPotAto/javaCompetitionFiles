import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class houseOfCards {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(new File("cards.txt"));
    int deckNumb = sc.nextInt();
    int cases = sc.nextInt();
    int totalNumCards = deckNumbs * 52;
    int cardsNeeded = 0;
    int numberOfTowers = 0;
    
    for(int i = 0; i < cases; i ++){
      int height = sc.nextInt();
      for(int j =0; j < height; j ++){
        cardsNeeded+= ((3*j)-1);    
      }
      numberOfTowers = cardsNeeded/deckNumb;
      out.println(numberOfTowers);
    }  
  }
}
