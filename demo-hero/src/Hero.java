public abstract class Hero {

  private int hp;
  private int mp;
  private int level;

  public Hero (int hp, int mp, int level) {
    this.hp = hp;
    this.mp = mp;
    this.level = level;
  }

  public int getLevel() {
    return this.level;
  }

  public void levelUp() {
    this.level += 1;
    this.hp = 
  }  

  public abstract void levelUpValues();

  }






  public void setHp(int hp) {
    this.hp = hp;
  }
  public void setMp(int mp) {
    this.mp = mp;
  }
  public void setPa(int pa) {
    this.pa = pa;
  }
  public void setPd(int pd) {
    this.pd = pd;
  }
  public void setMa(int ma) {
    this.ma = ma;
  }
  public void setMd(int md) {
    this.md = md;
  }
  public void setAg(int ag) {
    this.ag = ag;
  }
  public void setCc(int cc) {
    this.cc = cc;
  }
  public void setCd(int cd) {
    this.cd = cd;
  }