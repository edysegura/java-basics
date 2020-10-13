import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {
  private String id;
  private String email;
  private String name;
  private String username;
}
