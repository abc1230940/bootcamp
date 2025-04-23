// ! One to One: One Person has one height and one weight

// ! One to Many

import java.util.Arrays;

public class Classroom {
  private String[] names; // stores String array address
  private String[] tutors;

  public String[] getNames() {
    return this.names;
  }

  public void setNames(String[] names) { // ! 作者要求俾String array
    this.names = names;
  }
  public void setTutors(String[] tutors) {
    this.tutors = tutors;
  }

  public static void main(String[] args) {
    Classroom c1 = new Classroom();
    // John, Mary
    // create String Array
    String[] students = new String[2];
    students[0] = "John";
    students[1] = "Mary";
    // c1.setNames(students[0]); // error, students is array, student[0] -> String object
    c1.setNames(students); // 將成個array塞入去
    System.out.println(c1.getNames()[0]); // John -> get array name c1上面有個工具叫getNames

    // Update the second student name -> Steven

    // for loop, print all student names in the classroom
    for (int i = 0; i < c1.getNames().length; i++) {
      System.out.println(c1.getNames()[i]);
    }

    // Find Mary, and replace by Steven.
    for (int i = 0; i < c1.getNames().length; i++) {
      if (c1.getNames()[i].equals("Mary")) {
        c1.getNames()[i] = "Steven";
      }
      System.out.println(Arrays.toString(c1.getNames()));
    }
  }
}
