public class SuperDecimal {
  private double value;

  public SuperDecimal(String value) {
    this.value = Double.valueOf(value);
  }

  public double getValue() {
    return this.value;
  }

  public SuperDecimal add(SuperDecimal sd) {
    // this value (3.3)+ sd.getValue() (3.5)
    double result = sd.getValue() + this.value;
    return new SuperDecimal(String.valueOf(result)); // 要return返一個新的String object出嚟->正正係BigDecimal add出嚟的result,都係製造咗個新object
  }

  public void add2(SuperDecimal sd) {
    this.value = sd.getValue() + this.value;
  }

  public static void main(String[] args) {
    SuperDecimal sd = new SuperDecimal("3.3");
    System.out.println(sd.getValue()); // 3.3

    SuperDecimal vincent = new SuperDecimal("3.5"); // create新的object叫Vincent，之後可以再加落去個add算式到
    SuperDecimal sd2 = sd.add(vincent);
    System.out.println(sd2.getValue()); // 6.8 -> new object -> BigDecimal直程換咗新

    sd.add2(new SuperDecimal("4.2"));
    System.out.println(sd.getValue()); // 7.5 -> 修改自己的value -> 沒有換object

  }
  
}
