public enum WeekDay {
  MONDAY("HA"),
  TUESDAY("HO"),
  WEDNESDAY("HE"),
  THURSDAY("HU"),
  FRIDAY("NA"),
  SATURDAY("MA"),
  SUNDAY("PA");

  private String name;

  // 有人幫你開objects
  private WeekDay(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    // Loop enum values
    for (WeekDay day : WeekDay.values()) {
      System.out.println(day.getName());
    }

    System.out.println(WeekDay.FRIDAY.getName());
    System.out.println(WeekDay.FRIDAY.name());
  }


  
}
