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

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  public void levelUp() {
    this.level++;
    if (this.level == 2) {
        if (this instanceof Warrior) {
            this.hp = Warrior.levels[1][0];
            this.mp = Warrior.levels[1][1]; 
        } else if (this instanceof Mage) {
            this.hp = Mage.levels[1][0];
            this.mp = Mage.levels[1][1];
        } else if (this instanceof Archer) {
            this.hp = Archer.levels[1][0];
            this.mp = Archer.levels[1][1];
        }
    } else if (this.level == 3) {
        if (this instanceof Warrior) {
            this.hp = Warrior.levels[2][0]; 
            this.mp = Warrior.levels[2][1]; 
        } else if (this instanceof Mage) {
            this.hp = Mage.levels[2][0];
            this.mp = Mage.levels[2][1];
        } else if (this instanceof Archer) {
            this.hp = Archer.levels[2][0];
            this.mp = Archer.levels[2][1];
        }
    }
      }
  }

      
      

    
     
    
    

  
  

