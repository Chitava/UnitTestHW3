import Users.User;
import Users.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUserRepository {
    private final UserRepository repo = new UserRepository();
    User admin;
    User notAdmin;
    User notAdminTo;
    @BeforeEach
    public void SetUp(){
        admin = new User("Boris", "123", true);
        notAdmin = new User("Collin", "231", false);
        notAdminTo = new User("Pass", "213", true);

    }
    @Test
    void testAddUser(){
        assertThat(repo.findByName("Collin")).isTrue();
    }

    @Test
    void testUserOffButNotAdmin(){
        repo.setAllUserOffline(admin);
        assertThat(repo.findByName("Boris")).isTrue();
        }
    @Test
    void testUserOff(){
        repo.setAllUserOffline(admin);
        assertThat(repo.findByName("Collin")).isFalse();
    }

}
