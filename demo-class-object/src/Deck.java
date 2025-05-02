import java.util.Arrays;

public class Deck {

  private static final char[] SUITS = // 公家地方儲aaray，本身佢唔係一個組合,唔整就要不停copy and paste
    new char[] {Card.DIAMOND, Card.CLUB, Card.HEART, Card.SPADE};
  private static final char[] RANKS =
    new char[] {Card.ACE, Card.TWO, Card.THREE, Card.FOUR, Card.TWO, Card.THREE, Card.FOUR, Card.FIVE, Card.SIX, 
      Card.SEVEN, Card.EIGHT, Card.NINE, Card.TEN, Card.JACK, Card.QUEEN, Card.KING};
  
  private Card[] cards;

  // constructor
  public Deck() {
    this.cards = new Card[SUITS.length * RANKS.length];
    int idx = 0;
  for (int i = 0; i < SUITS.length; i++) { // 4格
    for (int j = 0; j < RANKS.length; j++) { // 13格
      this.cards[idx++] = new Card(RANKS[j], SUITS[i]); // ! card array會有card object -> 所以一定要有new
     }
    }
  }
  

  // getter
  public Card[] getCards() {
    return this.cards;
  }
  // setter

  public static void main(String[] args) {
    Deck d1 = new Deck();
    Card c10 = new Card(Card.THREE, Card.HEART);
    System.out.println(Arrays.toString(d1.getCards()));
  }

}
