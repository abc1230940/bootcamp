public class Phone extends Machine {
  private final String model; // 出世後不能改變 -> 不能再寫setter
  private Camera camera; // Phone -> Camera / Camera -> Phone都得，不應該用固定思維，覺得phone有camera, 但可以諗camera屬於phone
  private Photo[] photos; // ! 用phone去找photos array, 不是phone擁有photos array
  private int idx; // for photo

  public Phone(String model) {
    this.model = model;
    this.camera = new Camera(); // 自動會出部camera出嚟
    this.photos = new Photo[5]; // 自動出個photo album, 10格
    this.idx = 0;
  }

  public Camera getCamera() {
    return this.camera;
  }

  public boolean takePhoto() {
    if (this.idx >= photos.length) { // index用來放在photos arrays入面，用佢來決定爆唔爆
      return false;
    }
    this.photos[idx] = this.camera.takePhoto(); // phone要透過camera先可以製造photo object
    this.idx++;
    return true;
  }


  // ! public void setModel(String model) { -> 當你寫咗個final上去，就不能再寫個setter
    // this.model = model;
  // }

  public static void main(String[] args) {
    // phone
    Phone iphone4 = new Phone("IPHONE4");
    Phone iphone5 = new Phone("IPHONE5");
    c1.takePhoto();
    System.out.println(iphone4.getStatus());
    iphone4.turnOn();
    System.out.println(iphone4.getStatus());

    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto()); // false

    
  }
}

