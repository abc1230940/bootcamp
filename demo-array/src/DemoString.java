public class DemoString {
  public static void main(String[] args) {
    // Week 1: equals(), length(), charAt()
    // Week 2: Other String methods
    // 1. replace()
    System.out.println("bootcamp".replace('o', 'x')); // bxxtcamp -> 一定要有個參數
    System.out.println("bootcamoop".replace("oo", "lll")); // bllltcamlllp -> 能夠加長

    // 2. indexOf() -> 搵返字的index
    System.out.println("hello".indexOf('o')); // 4
    System.out.println("hello".indexOf('a')); // -1
    System.out.println("hello".indexOf(' ')); // -1

    // 3. concat() -> 較快的String相加
    String s1 = "hello" + "world"; // ! slow performance
    System.out.println(s1); // helloworld

    // "+" -> slow performance
    String s2 = "hello".concat("world");
    System.out.println(s2); // helloworld

    // 4. lastIndexOf() -> 最後一次出現的index
    System.out.println("hello".indexOf("he")); // 2, indexOf() -> firstIndexOf()

    System.out.println("hello".lastIndexOf('l')); // 3
    System.out.println("hello world".lastIndexOf('l')); // 9

    // 5. isEmpty() -> 搵String入面有冇empty -> 完全冇字
    boolean result = "".isEmpty();
    System.out.println(result); // true
    System.out.println("hello".isEmpty()); // false

    // 6. trim() -> 剩係會cut走頭同尾的空白string
    System.out.println(" hello world !!! ".trim()); // hello world !!!
    System.out.println(" hello world !!! ".trim().length()); // 15

    // ! Coding Style: chain methods
    System.out.println(" hello ".replace('e', 'a').trim().charAt(1)); // ! a -> charAt()之後已經唔係String, 係char -> primitive -> 沒有工具
    System.out.println("hello".replace('L', 'x')); // hello

    // String methods return different types

    // 7. substring
    // ! end index - 1: 
    // ! 'e' -> index 1, 'l' -> index 2 
    System.out.println("hello".substring(1, 3)); // ! "el" -> 第二個index要index+1
    System.out.println("hello".substring(0)); // "hello", from index 0, to the end of string

    String unknown = "hello world";
    // extraxt the second & third characters
    // if string not long enough, extract as much as possible
    // "h" -> "" (group 1)
    // he -> e (group 2)
    // hell -> el (group 3 - normal case)
    // "hello world" -> el (group 3 - normal)

    if (unknown.length() > 3) {
      System.out.println(unknown.substring(1, 3));
    } else if (unknown.length() > 0 && unknown.length() <= 3) {
      System.out.println(unknown.substring(1));
    } else {
      System.out.println("");
    }

    // 8. toLowerCase(), toUpperCase()
    System.out.println("HELLO!!!".toLowerCase()); // hello!!!
    System.out.println("heLLO!!!".toLowerCase()); // hello!!!
    System.out.println("heLLO!!!".toUpperCase()); // HELLO!!!
    System.out.println("hello!!!".toUpperCase()); // HELLO!!!

    // ! 9. contains() -> 常用的工具，會連埋boolean一齊用，很好用的東西:)
    System.out.println("hello".contains("ll")); // true
    System.out.println("hello".contains("lll")); // false
    String name = "Steven";
    if (name.contains("t")) {
      System.out.println("Your name contains t character"); // Your name contains t character
    }
    System.out.println("陳大明".contains("陳")); // true
    System.out.println("陳大明".contains("小")); // false

    // ! 10. startWith(), endWith() -> test -> boolean
    System.out.println("hello".startsWith("he")); // true -> 前面有空白就會變false
    System.out.println("hello".startsWith("helll")); // false
    System.out.println("hello".endsWith("lo")); // true
    System.out.println("hello".endsWith("oo")); // false

  }
  
}
