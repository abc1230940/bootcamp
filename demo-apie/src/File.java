// ! Interface
// APIE : "A" -> abstraction
// Class Signiture -> 可知個Class大概做咩,不用睇codes
public class File implements Readable, Writable { // Functions, skills
  // ! implement "interface"
  private String content;

  public File(String content) {
    this.content = content;
  }

  public String getContent() {
    return this.content;
  }

  // ! Once you "@override", Java checks if the parent class/ Interface has this method
  // ! if exists, this child class overrides the parent/ interface method
  @Override
  public String read() { // 其實係getter
    return this.content;
  }

  // Method Signiture: method name + input parameters -> 2者都有先得
  @Override
  public void write(String content) {
    this.append(content);
  }

  private void append(String newContent) { // 加東西入去, private的method會放最底, private代表只能在同class用
    this.content += newContent;
  }

  public static void main(String[] args) {
    File f1 = new File("hello world");
    f1.append("!!!!!");
    System.out.println(f1.getContent());
  }
}
