import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight -> bmi
  // bmi = weight / height * height
  private double height;
  private double weight;

  public Person() { // empty constructor

  }

  public Person (double height, double weight) { // all-arguments constructor
    this.height = height;
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public double getHeight() {
    return this.height;
  }
  public double getWeight() {
    return this.weight;
  }

  public double getBmi() { // presentation, 不要寫BigDecimal(盒) -> BigDecimal只會用在計算上
    return BigDecimal.valueOf(this.weight).divide(BigDecimal.valueOf(this.height * this.height), 1, RoundingMode.HALF_UP).doubleValue();
  }

  public static double getBmi2(double height, double weight) { 
    return BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(height * height), 1, RoundingMode.HALF_UP).doubleValue();
  }

  public String getWeightStatus() {
    double bmi = this.getBmi(); // ! this.getBMI係將attribute放落object時才有的東西, 用完佢會消失, 但不要用在if，因為會不停call個method, 會慢
    if (bmi > 0 && bmi < 18.5) { 
      return "Weight Status is Underweight"; // "return" -> exit method
    } else if (bmi >= 18.5 && bmi < 25) {  // ! this.getBMI係將attribute放落object時才有的東西, 用完佢會消失, 但不要用在if，因為會不停call個method, 會慢
      return "Weight Status is Normal";
    } else if (bmi >= 25 && bmi < 29.9) {
      return "Weight Status is Overweight";
    }
      return "Weight Status is Obese"; // base condition, 不會寫else
    }

    public static String getWeightStatus2(double height, double weight) { // ! 這個method可以慳資源
      double bmi = getBmi2(height, weight);
      if (bmi > 0 && bmi < 18.5) { 
        return "Weight Status is Underweight"; // "return" -> exit method
      } else if (bmi >= 18.5 && bmi < 25) {  
        return "Weight Status is Normal";
      } else if (bmi >= 25 && bmi < 29.9) {
        return "Weight Status is Overweight";
      }
        return "Weight Status is Obese";
    }

    public boolean equals(Person person) { // 一個person的定義, 要寫俾人聽
      return this.height == person.getHeight()
            && this.weight == person.getWeight();
    }

    public String toString() { // 呈現object方法 -> String
      return ("Person(" + "height=" + this.height + ",weight=" + this.weight + ")");
    }

  public static void main(String[] args) {
    Person p1 = new Person(1.75, 65);
    p1.setHeight(1.75);
    p1.setWeight(60.4);

    Person p2 = new Person(1.76, 76);
    System.out.println(p2.getHeight());
    System.out.println(p2.getWeight());

    System.out.println(p1.getBmi());
    System.out.println(p1.getWeightStatus());

    System.out.println(Person.getBmi2(1.75, 65.5));
    System.out.println(Person.getWeightStatus2(1.75, 76));

    System.out.println(p1); // ! p1係一個地址，佢自己會自動call.toString，所以可以唔加都得，最緊要寫好個.toString method
    
    // You preparedthe equals() method. p2 is able to call equals()
    Person p3 = new Person(1.76, 76);
    System.out.println(p2.equals(p3)); // true
    System.out.println(p1.equals(p2)); // false
  }
}
