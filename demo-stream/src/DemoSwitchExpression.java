public class DemoSwitchExpression {
  // Java 14
   public static enum WEEKDAY {
      MON, TUE, WED, THU, FRI;
  }
  public static void main(String[] args) {
    // ! switch cannot do range checking
    // ! 1. range checking
    // ! 2. AND OR
    int score = 95;
    char grade = ' ';
    switch(score) {
      case 90:
      grade = 'A';
      break;
      case 91:
      grade = 'A';
      break;
      // ...
      default:
      break;
    }
  
  

    // But for enum, it is better to use switch, because the number if enum values is finite
    // ! still cannot use OR
    // ! normal switch cannot support missing value checking
    WEEKDAY weekday = WEEKDAY.WED;
    switch (weekday) {
      case MON:
      System.out.println("Learn Java");
      break;
      case TUE:
      System.out.println("Learn Java");
      break;
      // ! forgot to write the code for Wednesday
      break;
      case TUR:
      System.out.println("Learn Java");
      break;
      case FRI:
      System.out.println("121211");
      break;
      default;
      System.out.println("121212");
      break;
    }

      // Java 14 : Switch Expression
      switch(weekday) {
        case MON -> System.out.println("I am learning Java.");
        case TUE -> System.out.println("I am learning Java.");
        case MON -> System.out.println("I am learning Java.");
        case MON -> System.out.println("I am learning Java.");
        case MON -> System.out.println("I am learning Java.");
      }
      // ! After Java 21, cannot check missing values, 寫返default會好D

    }
      
    
  
   


  

