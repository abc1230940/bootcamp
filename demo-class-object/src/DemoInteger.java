public class DemoInteger {
  public static void main(String[] args) {
    Integer x = 3; // autobox
    Integer y = 128; // autobox

    // check if y > x? not primitive -> compareTo
    System.out.println(y.compareTo(x) > 0); // true
    System.out.println(y > x); // true -> 不建議咁寫,auto-unbox

    Integer y2 = 128;
    System.out.println(y.compareTo(y2)); // 0
    System.out.println(y == y2); // false, bcause y and y2 are different objects

    Integer x2 = 3;
    System.out.println(x == x2); // true

    Integer x3 = new Integer(3); // 夾硬開個新object
    System.out.println(x == x3); // false

    Integer x4 = Integer.valueOf(3); // 呢個方法都唔會開新object
    System.out.println(x == x4); // true

    // how about < - 128 or > 127?
    Integer y3 = Integer.valueOf(128);
    System.out.println(y2 == y3); // false -> 超出-128 to 127的範圍
  }
  
}
