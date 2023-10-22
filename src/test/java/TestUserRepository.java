import Users.User;
import Users.UserRepository;
import org.junit.jupiter.api.BeforeEach;

public class TestUserRepository {
    private final UserRepository repo = new UserRepository();
    User admin;
    User notAdmin;
    User notAdminTo;
    @BeforeEach
    public void SetUp(){
        admin = new User("Boris", "123", true);
    }
}
