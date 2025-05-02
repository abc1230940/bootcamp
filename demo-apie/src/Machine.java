public class Machine {
  private boolean status;

  public Machine() {
    this.status = false;
  }

  // method
  public void turnOn() {
    this.status = true;
  }

  public void turnOff() {
    this.status = false;
  }

  public String getStatus() {
    return this.status == true ? "On" : "Off";
  }
public static void main(String[] args) {
  Machine m1 = new Machine();
  m1.turnOn();
  System.out.println(m1.getStatus()); // ON
  }

}
