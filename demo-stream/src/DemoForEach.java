import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DemoForEach {
  public static void main(String[] args) {
    // List<User>
    // forEach Consumer -> print joinDate, email, userid

    User u1 = User.builder().userid("abc123").email("abc123@gmail.com").joinDate(LocalDate.of(2024, 5, 10)).build();
    User u2 = User.builder().userid("cde456").email("cde456@gmail.com").joinDate(LocalDate.of(2023, 6, 21)).build();
    User u3 = User.builder().userid("fgh789").email("fgh789@gmail.com").joinDate(LocalDate.of(2021, 2, 28)).build();
    List<User> users = new ArrayList<>(List.of(u1, u2, u3));

    users.forEach(user -> {
      System.out.println(user.getUserid());
      System.out.println(user.getEmail());
      System.out.println(user.getJoinDate());
    });
  }
}
