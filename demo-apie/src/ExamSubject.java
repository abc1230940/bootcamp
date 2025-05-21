import java.util.Objects;

public class ExamSubject {
  // name
  // score
  private static int EXAM_CODE = 0;
  private long id;
  private Name name;
  private int score;

  private ExamSubject(Name name, long id) {
    this.name = name;
    this.id = id;
  }

  public static ExamSubject ofChinese() {  // ! 方便用家可以連名都唔駛寫，enum常用
    return new ExamSubject(Name.CHINESE, ++EXAM_CODE);
  }

  public static ExamSubject ofEnglish() {  // ! 方便用家可以連名都唔駛寫，enum常用
    return new ExamSubject(Name.ENGLISH, ++EXAM_CODE);
  }

  public static ExamSubject ofHistory() {  // ! 方便用家可以連名都唔駛寫，enum常用
    return new ExamSubject(Name.HISTORY, ++EXAM_CODE);
  }

  public String getName() { // enum本身有的工具
    return this.name.name();
  }

  public int getScore() {
    return this.score;
  }

  public long getId() {
    return this.id;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof ExamSubject)) {
      return false;
    }
    ExamSubject examSubject = (ExamSubject) obj;
    return (this.id == examSubject.getId());
  }

  @Override
  public String toString() {
    return ("Id=" + this.id + "name=" + this.name + "score=" + this.name.name());
  }
  

  @Override
  public int hashCode() {
    return Objects.hash(this.id);
  }

  
  

  // Constructor
  // getter, setter
  // equals(), toString, hashCode()

  public enum Name {
    CHINESE, ENGLISH, MATHEMATICS, LIBERAL_STUDY, CHEMISTRY, BIOLOGY, 
    PHYSICS, CHINESE_HISTORY, HISTORY, ACCOUNT, ECONOMICS, GEOGRAPHY;
  }

  public static void main(String[] args) {
    ExamSubject es1 = ExamSubject.ofEnglish();
    ExamSubject es2 = ExamSubject.ofEnglish();
    ExamSubject es3 = ExamSubject.ofHistory();
    System.out.println(es1.equals(es2));
    System.out.println(es1.hashCode());
    System.out.println(es2.hashCode());
    System.out.println(es3.hashCode());
    System.out.println(es1.getName());
  }
}
