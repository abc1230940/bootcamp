import java.time.LocalDate;

public class User {
  private String userid;
  private String email;
  private LocalDate joinDate;

  public String getUserid() {
    return this.userid;
  }
  
  public String getEmail() {
    return this.email;
  }

  public LocalDate getJoinDate() {
    return this.joinDate;
  }

  public static Builder builder() {
    return new Builder(); // 多餘的東西
  }

  private User(Builder builder) {
    this.userid = builder.userid;
    this.email = builder.email;
    this.joinDate = builder.joinDate;
  }


  public static class Builder {
    private String userid;
    private String email;
    private LocalDate joinDate;

    public Builder userid(String userid) {
      this.userid = userid;
      return this; 
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder joinDate(LocalDate joinDate) {
      this.joinDate = joinDate;
      return this;
    }

    public User build() {
      return new User(this); // 因為Builder Class是inner class, 所以可以用到private constructor
    }
}

public static void main(String[] args) {
  User user =  User.builder()
              .userid("John")
              .email("john@gmail.com")
              .joinDate(LocalDate.of(2025,2,20))
              .build();

}
  }
