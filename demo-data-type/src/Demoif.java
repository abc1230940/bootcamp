public class Demoif {
  public static void main(String[] args) {
    int x = 3;
    // asking if  x > 3
    // x > 3 -> true / false
    boolean result = x > 3;
    System.out.println(result); // false

    boolean result2 = x >= 3;
    System.out.println(result2); // true

    // if 條件
    if (x > 3) { // false -> skip code block
      System.out.println("x is larger than 3"); // 沒有任何東西出現
    }

    if (x >= 3) {
      System.out.println("x is larger than or equal to 3"); // x is larger than or equal to 3
    }

    // if + else
    if (x > 3) {
      System.out.println("do something ... "); // 沒有任何東西出現
    } else { // implication: x <= 3
      System.out.println("do something else ... "); // do something else ...
    }

    // x = 3, "=" -> assignment (assign 3 to x)
    // ! "==" -> asking if they are same value, !!!!不要寫 = !!! 只能寫true or false的事
    char gender = 'F';
    if (gender == 'M') { // false
      System.out.println("He is male."); // 沒有任何東西出現
    } else {
      System.out.println("She is female."); // She is female.
    }

    // ! "!=" -> asking if they are not equal
    if  (gender != 'M') { // true
      System.out.println("Not a male."); // Not a male.
    }

    if (x == 3) { // true
      System.out.println("superman"); // superman
    }

    // Math Operators: +, -, *, /, %
    int r = 14 / 3;
    System.out.println(r); // 4

    // % -> remainder
    int r2 = 14 % 3;
    System.out.println(r2); // 2

    // Comparison Operators: >, <, >=, <=, !=, ==
    // Apply for all primitives

    // ! if + equals()
    String s2 = "Bootcamp";
    if (s2.equals("Bootcamp")) { // true / false -> true
      System.out.println("12345"); // 12345
    }

    // Approach 1
    // Step 1: s2.equals("Bootcamp") -> true
    // Step 2: true == false -> false
    // Step 3: skip code block
    if (s2.equals("Bootcamp") == false) { // false
      System.out.println("23456"); // 沒有任何東西出現
    }

    // Approach 2
    // Step 1: s2.equals("Bootcamp") -> true
    // Step 2: !true == false -> false, !用來反轉true/false
    // Step 3: Skip code block
    if (!s2.equals("Bootcamp")) { // ! 都係false的意思, 先行s2.equals("Bootcamp")，後行!
      System.out.println("23456"); // 沒有任何東西出現
    }

    boolean r3 = !(x > 3); // !false -> true
    System.out.println(r3); // true

    boolean isRaining = true;
    if (!isRaining) { // !true -> false 
      System.out.println("I am running ..."); // 沒有任何東西出現
    }

    // if + length(), charAt()
    // s2.length() >= 3 -> true / false
    if (s2.length() >= 3) {
      System.out.println("hello");
    } else {
      System.out.println("bye");
    }

    // Question: check if the last character of s2 equals to 'a'
    // if yes, print "yes", if no, print "no"
    // ! charAt() + length()
    // Step 1: s2.length() -> 8
    // Step 2: 8 - 1 -> 7
    // Step 3: charAt(7) -> 'p'
    // Step 4: 'p' == 'a' -> false
    // Step 5: print "no"
    if (s2.charAt(s2.length() - 1) == 'a') {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    // Question: Find the middle char of the string
    // i.e. abcde -> c
    // abcd -> c
    // ab -> b
    // a -> a
    String s3 ="hello";
    if (s3.length() % 2 == 1) { // odd
      System.out.println(s3.charAt(s3.length()/2));
    } else { // even
      System.out.println(s3.charAt(s3.length()/2) - 1);
    }

    // odd number
    int x5 = 10;
    // Assignment (right to left)
    boolean isOdd = x5 % 2 == 1;
    System.out.println(isOdd); // true

    boolean isLargerThan5 = x5 > 5;
    System.out.println(isLargerThan5); // true

    // && -> AND
    if (isOdd && isLargerThan5) {
      System.out.println("It is an odd number and larger than 5.");
    }

    // even number and larger than 5
    if (!isOdd && isLargerThan5) { // even
      System.out.println("It is an even number and larger than 5.");
    }

    // || -> OR
    if (isOdd || isLargerThan5) { // -> 是但一樣中其中一個條件
      System.out.println("It is an odd number OR larger than 5.");
    }

    int x6 = 10;
    // Step 1: x6 < 9. If true, exit criteria checking; if false, go step 2.
    // Step 2: x6 % 2 ==0 && x6 > 0
    if (x6 < 9 || x6 % 2 == 0 && x6 > 0)
    System.out.println("yes");

        // ! For loop
    // 3 statements
    // for (initialization; contiune condition -> 當符合條件，loop會繼續行; )
    // Step 1: int i = 0;
    // Step 2: check if i < 3 -> true, next step
    // Step 3: print hello
    // Step 4: i = i + 1 -> 1
    // Step 5: check if i < 3 -> true, next step
    // Step 6: print hello
    // Step 7: i = i + 1 -> 2
    // Step 8: check if i < 3 -> true, next step
    // Step 9: print hello
    // Step 10: i = i + 1 -> 3
    // Step 11: check if i < 3 -> false -> exit loop
    for (int i = 0; i < 3; i = i + 1) { // ! 如果想loop 3次 -> i = 0 同埋 i < 3 <- 只記呢個
      System.out.println("Hello"); // print完hello會再loop多次，直到佢MEET唔列個條件
    }


    // ! Question: Counting, if只能夠向下行, for loop能夠循環programme
    String s5 = "hello world"; // index = 0,1,2,3,4
    // Count how many character 'o' in s5.
    int count = 0;
    int a = s5.length();
    for (int i = 0; i < a; i = i + 1) { // 0,1,2,3,4
      if (s5.charAt(i) == 'o') {
        count = count + 1;
      }
    }
    System.out.println(count); // 2

  }

}
