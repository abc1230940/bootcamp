import java.time.DayOfWeek;
import java.time.LocalDate;

public class DemoDate {
  public static void main(String[] args) {
    // 2025 4 17
    int year = 2025;
    int month = 4;
    int day = 17;

    // For date value, we should not use int variable for storage.
    // because it is hard to perform operation on "date", i.e comparison? add day?

    LocalDate today = LocalDate.of(2025, 4, 17);
    System.out.println(today); // "2025-04-17"

    LocalDate day2 = today.plusDays(14);
    System.out.println(day2); // "2025-05-01"

    LocalDate day3 = today.plusMonths(2);
    System.out.println(day3); // "2025-06-17"

    LocalDate day4 = today.plusWeeks(50);
    System.out.println(day4); // "2026-04-02"

    // minusDays
    LocalDate  day5 = today.minusDays(90);
    System.out.println(day5); 

    // isAfter() -> boolean
    if (today.isAfter(LocalDate.of(2025, 4, 16))) { 
      System.out.println("today > 2025.4.16");
    }

    // isBefore() -> boolean
    if (today.isBefore(LocalDate.of(2025, 4, 23))) {
      System.out.println("today < 2025.4.23");
    }

    // isEqual() -> boolean
    if (today.isEqual(LocalDate.of(2025, 4, 17))) {
      System.out.println("today = 2025.4.23");
    }

    // ! Comparison
    System.out.println(today.isLeapYear()); // false
    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear()); // false
    System.out.println(LocalDate.of(2016, 1, 1).isLeapYear()); // true

    // +
    System.out.println(LocalDate.of(2016, 2, 28).plusDays(1)); // 2016-02-29 -> 再加知1上去

    System.out.println(LocalDate.of(2016, 1, 1).getDayOfYear()); // 1
    System.out.println(LocalDate.of(2016, 1, 1).getDayOfMonth()); // 1

    System.out.println(LocalDate.of(2016, 1, 1).getDayOfWeek()); // FRIDAY -> 不用夾硬將FRIDAY代入一個value

    // Technically OK, not suitable
    String dayOfWeek = "MONDAY";

    DayOfWeek dow2 = DayOfWeek.of(3);
    System.out.println(dow2); // WEDNESDAY

    System.out.println(LocalDate.now()); // 2025-04-17


    }


  }
  

