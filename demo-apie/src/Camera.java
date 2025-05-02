public class Camera extends Machine {
  public Photo takePhoto() {
    return new Photo();
  }

  public static void main(String[] args) {
    Camera c1 = new Camera();
    c1.turnOn();
    System.out.println(c1.getStatus());
  }
}

