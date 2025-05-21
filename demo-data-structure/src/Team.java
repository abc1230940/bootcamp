import java.util.LinkedList;

public class Team {
  // array, ArrayList
  // Usage: 99% same as ArrayList
  private LinkedList<Staff> staffs; // ! ArrayList同LinkedList轉換只係改一個字，但2者分別好大

  public Team() {
    this.staffs = new LinkedList<>();
  }

  // Add to tail -> LinkedList
  public void add(Staff staff) {
    this.staffs.add(staff); // ! no array implementation 
  }

  public boolean remove(long staffId) {
    return this.staffs.remove(new Staff(staffId));
  }

  // ArrayList較好
  public int size() {
    return this.staffs.size();
  }

  

  public static void main(String[] args) {
    // .add() 
    Team team = new Team(); // 可以在constructor到寫開咗個LinkedList
    team.add(new Staff(1));
    team.add(new Staff(2));
    System.out.println(team.size()); // 2

    // Staff's equals()
    team.remove(2L);
    System.out.println(team.size());


    // Difference between ArrayList and LinkedList
    // - Underlying Data Structure: ArrayList (array); LinkedList (object links object)
      // Array 
        // 1. Fixed length, recreate array -> copy elements
        // 2. Locate the element by array position
      // LinkedList 
        // 1. stores forst and last
        // 2. each node contains the "previous" and the next 
  }
}
