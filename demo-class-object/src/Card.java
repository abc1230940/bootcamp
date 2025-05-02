public class Card {
  // ! static -> common values for all objects (Not belongs to objects)
  // ! final -> 話俾人聽唔可以再改after initialization -> Diamond這個字唔會再改變
  // Non-static and Non-Final
  // Static and non-final
  // Non-static and Final
  // Static and Final
  public static final char DIAMOND = '1'; // Dictionary的東西, 比人參考1->DIAMOND的意思, 所以可以在main寫DIAMOND,就會自動幫你帶返去'D'
  public static final char CLUB = '2';
  public static final char HEART = '3';
  public static final char SPADE = '4';

  public static final char ACE = 'M';
  public static final char TWO = 'A'; // A-A剛好是array的頭
  public static final char THREE = 'B';
  public static final char FOUR = 'C';
  public static final char FIVE = 'D';
  public static final char SIX = 'E';
  public static final char SEVEN = 'F';
  public static final char EIGHT = 'G';
  public static final char NINE = 'H';
  public static final char TEN = 'I';
  public static final char JACK = 'J';
  public static final char QUEEN = 'K';
  public static final char KING = 'L';

  // rank
  // suite
  // ! 先諗attributes，先唔好諗隻game的玩法，專心形容好隻牌先
  // ! 1. Readability最重要
  // ! 2. Data Type Range -> 越窄越好，用最少嘅可能性
  private char rank; // 1,2,3,4,5,6,7,8,9,T,J,Q,K
  private char suit; // D,C,H,S

  // Constructor
  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  } 
  
  // Setter, Getter
  public void setRank(char rank) {
    this.rank = rank;
  }
  public void setSuit(char suit) {
    this.suit = suit;
  }
  public char getRank() {
    return this.rank;
  }
  public char getSuit() {
    return this.suit;
  }

  // color
  public boolean isRed() {
    if (suit == DIAMOND || suit == HEART) {
      return true;
    }
    return false;
  }

  // this (self)
  // ! equals return boolean 係約定俗成
  public boolean equals(Card card) {
    return (this.suit == card.getSuit() && this.rank == card.getRank()); // 可以直接一句寫晒
  }
  
  // 10.compareTo(3) -> 1
  // 3.compareTo(10) -> -1
  // ! 用ascii做係會最好 -> 最能比較到牌之間的大細
  // 0, -1, 1
  public int compareTo(Card card) { // ! compareTo係出1, -1/ 0 -> int, compareTo return int係約定俗成
    if (this.rank == card.getRank()) {
      if (this.suit > card.getSuit()) {
        return 1;
    } else if (this.suit < card.getSuit()) {
      return -1;
    }
    return 0;
    }
    // different rank
    return this.rank > card.getRank() ? 1: -1;
    }

    public String toString() {
      return ("Card(" + "rank=" + this.rank + ",suit=" + this.suit + ")");
     }
    
  public static void main(String[] args) {
    Card c1 = new Card(Card.TWO, Card.CLUB);
    Card c2 = new Card(TWO, CLUB);
    Card c3 = new Card(THREE, CLUB);
    Card c4 = new Card(TWO, HEART);
    Card c5 = new Card(ACE, SPADE);
    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
    System.out.println(c1.equals(c4));
    System.out.println(c1.equals(c5));

    System.out.println(c1.compareTo(c2)); // 0
    System.out.println(c1.compareTo(c3)); // -1
    System.out.println(c5.compareTo(c1)); // 1

    Card c6 = new Card(ACE, DIAMOND);
    System.out.println(c5.compareTo(c6)); // 1

    System.out.println(c6); // Card(rank=Z, suit=1) -> 暫時唔會出到想要的英文字(ACE DIAMOND), 冇toString,print地址
  }
}

