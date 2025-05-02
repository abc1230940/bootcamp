import java.util.Random;

public class ShuffleManager {

  // shuffle once
  public Card[] shuffle(Card[] cards) {
    if (cards.length <= 2) {
      return cards;
    }
    // random (1-50), skip 0 and 51
    int idx = new Random().nextInt(cards.length - 2) + 1; // (0 - 49) + 1 -> 1 - 50
    Card backup1 = cards[idx];
    Card backup2 = cards[idx + 1];
    for (int i = idx - 1; i >= 0; i--) {
      cards[i + 2] = cards[i];
    }
    cards[0] = backup1;
    cards[1] = backup2;
    return cards;
  }
  
  public static void main(String[] args) {
    int[] arr =new int[]{1,2,3,4,5,6,7};
    // random -> 4
    // number of cards = 2
    // [5,6,1,2,3,4,7]

    Card[] cards = new Card[] {new Card(Card.ACE, Card.CLUB), new Card(Card.TEN, Card.CLUB), new Card(Card.ACE, Card.HEART)};

    // Case 2; 52 Cards
    Deck deck = new Deck();
    Card[] newCards2 = ShuffleManager.shuffle
  }
}
