public class SuperString {
  private char[] chs;

  public String getString() {
    return String.valueOf(this.chs); // from char[] to string
  }

  // You define your own way to store the String value
  public void setString(String str) {
    this.chs = new char[str.length()];
    // this.chs = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      this.chs[i] = str.charAt(i);
    }
  }

  // ! 找出返char aaray中index係邊一個英文字
  public char charAt(int index) {
    return this.chs[index];
  }

  // this(自己的object) vs ss(人input果隻object)
  public boolean equals(SuperString ss) { 
      if (this.chs.length != ss.getString().length()) { // ! 先諗晒有咩case係false先 -> coding style
        return false;
      }
      for (int i = 0; i < this.chs.length; i++) {
        if (this.chs[i] != ss.getString().charAt(i)) {
          return false;
        }
      }
      return true;
    }

    // replace(char x, char y)

  public static void main(String[] args) {
    SuperString ss1 = new SuperString();
    ss1.setString("abc");
    System.out.println(ss1.charAt(0)); // a

    SuperString ss2 = new SuperString();
    ss2.setString("abcd");

    SuperString ss3 = new SuperString();
    ss3.setString("abd");

    SuperString ss4 = new SuperString();
    ss4.setString("abc");

    System.out.println(ss1.equals(ss2)); // false
    System.out.println(ss1.equals(ss3)); // false
    System.out.println(ss1.equals(ss4)); // true
  }
}
