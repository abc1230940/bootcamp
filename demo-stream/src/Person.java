// Java 16: Record (History -> cannot be modified and no status change)
// ! No Setter
// ! Getter
// ! All Argument Constructor
// ! equals(), hashCode(), toString()
// 1. 不是所有class都要setter, 應用最少的東西做 -> 運送DATA的儲存工具
// 2. 不用再晒時間寫templates
// 3. Database的資料拎返出來
// 係class
public record Person(String name, int age) { // extends Human {
  public static final int VALUE = 360; // OK to place static variable

  // ! Not ALLOWED to add other attributes -> 不能企圖set
  // private String email;

  // ! Youcan still use "this" for writing your own methods
  public String getInfo() {
    return this.name + "," + this.age;
  }

  // static method ok
  public static int sum(int x, int y) {
    return x + y;
  }

  // equals()能override // ! 不建議咁做，因為咁樣開record沒有用, 不應改變佢個status
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Person)) {
      return false;
    }
    Person person = (Person) obj;
    return this.name.equals(person.name());
  }


  // ! 只要不改到attribute 的方法都可以用
  
}
