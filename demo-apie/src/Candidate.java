public class Candidate {
  private static long count = 0;

  private String name;
  private long id;
  private ExamSubject[] examSubjects;
  
  public Candidate(String name) {
    count++;
    this.name = name;
    this.id = count;
    this.examSubjects = new ExamSubject[3];
  }

  public void attendEnglishExam() {
    this.examSubjects[1] = ExamSubject.ofEnglish();
  }

  public void attendChineseExam() {
    this.examSubjects[0] = ExamSubject.ofChinese();
  }

  public void attendHistoryExam() {
    this.examSubjects[2] = ExamSubject.ofHistory();
  }

  public ExamSubject getEnglishSubject() { // 只是修改object的資料，就咁用object開方法就得，不用加新object
    return this.examSubjects[1];
  }

  public ExamSubject getChineseSubject() {
    return this.examSubjects[0];
  }

  public ExamSubject getHistorySubject() {
    return this.examSubjects[2];
  }

  public int getChineseScore() {
    if (this.examSubjects[0] != null) {
      return this.examSubjects[0].getScore();
    } else {
      System.out.println("The candidate didn't attend the Chinese exam.");
    return -1;
    }
  }

  public int getHistoryScore() {
    if (this.examSubjects[2] != null) {
      return this.examSubjects[2].getScore();
    } else {
      System.out.println("The candidate didn't attend the History exam.");
    return -1;
    }
  }

  public int getEnglishScore() {
    if (this.examSubjects[1] != null) {
      return this.examSubjects[1].getScore();
    } else {
      System.out.println("The candidate didn't attend the English exam.");
    return -1;
    }
  }

  public void setEnglish(int score) {
    if (this.examSubjects[1] != null) { // ! 任何時候都唔可以爆炸,所以要防止佢error的方法
      this.examSubjects[1].setScore(score);
    } else {
      System.out.println("The candidate didn't attend the English exam.");
    }
    
  }

  public void setChinese(int score) {
    if (this.examSubjects[0] != null) {
      this.examSubjects[0].setScore(score);
    } else {
      System.out.println("The candidate didn't attend the Chinese exam.");
    }
  }
  
  public void setHistory(int score) {
    if (this.examSubjects[2] != null) {
      this.examSubjects[2].setScore(score);
    } else {
      System.out.println("The candidate didn't attend the History exam.");
    }
  }

  public static void main(String[] args) {
    Candidate canA = new Candidate("John");

    canA.attendEnglishExam();
    canA.setEnglish(80);
    canA.attendHistoryExam();
    canA.setHistory(67);
    canA.attendChineseExam();
    canA.setChinese(56);
    System.out.println(canA.getEnglishScore());

    Candidate canB = new Candidate("Kitty");
    canB.attendEnglishExam();
    canB.setEnglish(75);
    canB.attendHistoryExam();
    canB.setHistory(89);
    canB.attendHistoryExam();
    canB.setChinese(64);

    System.out.println(canA);
    System.out.println(canA.getEnglishSubject().getId()); // 1
    System.out.println(canB.getEnglishSubject().getId()); // 4

    System.out.println(canA.getChineseSubject().getName());

  }
}
