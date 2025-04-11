public class DemiASCII {
  public static void main(String[] args) {
    char x = '\'';
    System.out.println(x); // a

    // char: 0 - 6xxxx
    // int: 2.1b
    int ascii = x; // char能夠樂安全塞入int,夠大
    System.out.println(ascii);

    // b
    System.out.println(ascii); // 98
    // z
    System.out.println(ascii); // 122

    // char (Math operation)
    // char - char -> int - int -> int
    System.out.println(('b' - 'a'));
    // given a-z, convert to 1-26
    char v = 'a';
    int converted = v - 'a' + 1;
    System.out.println(converted);


  }
}
