public class RuleManager {

  // Input -> Output
  public static boolean isPair(Card c1, Card c2) {
    return c1.getRank() == c2.getRank();
  }
  public static boolean isThreeOfKind(Card c1, Card c2, Card c3) {
    return c1.getRank() == c2.getRank() && c2.getRank() == c3.getRank();
  }
  // given 5 cards
  // 8 7 8 8 7
  public static boolean isFullHouse(Card[] cards) {
    if (cards == null || cards.length != 5) {
      return false;
    }
    int[] chs = new int[13]; // counting數目
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] == null) { // 如果當中冇嘢都唔俾check
        return false;
      }
      chs[cards[i].getRank() - 'A']++;
    }
    // 5
    // 1 1 1 1 1 
    // 3 2 0 0 0 0 0 0 0 0 0 0 0
    boolean withThreeKind = false;
    boolean withPair = false;
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 2) {
        withPair = true;
      }
      if (chs[i] == 3) {
        withThreeKind = true;
      }
    }
    return withPair && withThreeKind;
  }
  // 6,7,8,9,10
  // A,K,Q,J,10
  // ! A,2,3,4,5 -> special handle
  
  public static boolean isStraight(Card[] cards) {
    // array
    if (cards == null || cards.length != 5) {
      return false;
    }
    int[] chs = new int[13]; // counting數目
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] == null) { // 如果當中冇嘢都唔俾check
        return false;
      }
      chs[cards[i].getRank() - 'A']++;
    }
    boolean checkup = false;
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] > 1) {
        return false;
      }
      if (checkup == true && chs[i] == 0) {
        return false;
      }
      if (chs[i] == 1) {
        checkup = true;
      }
      return true;
    }
    if (chs[12] == 1 && chs[0] == 1 && chs[1] == 1 && chs[2] == 1 && chs[3] == 1) {
      return true;
  }

  public static boolean isFlush(Card[] cards) {
    if (cards.length != 5) {
      return false;
    }
    return (cards[0].getSuit() == cards[1].getSuit() 
      && cards[0].getSuit() == cards[2].getSuit() 
      && cards[0].getSuit() == cards[3].getSuit()
      && cards[0].getSuit() == cards[4].getSuit());

      }

    public static void main(String[] args) {
      
    }

  }
  

