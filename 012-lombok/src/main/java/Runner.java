public class Runner {
  public static void main(String[] args) {
    User user = User.builder()
      .id("U37")
      .name("Davi Segura")
      .username("davisegura")
      .build();

    System.out.println("Hi there! " + user.getName());
  }
}
