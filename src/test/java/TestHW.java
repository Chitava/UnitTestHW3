import Users.UserRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestHW {
    MainHW newExempl = new MainHW();
    UserRepository repo = new UserRepository();




    @Test
    void testEvent() {
        assertThat(newExempl.EventOrNot(2)).isTrue();
    }

    @Test
    void testNotEvent() {
        assertThat(newExempl.EventOrNot(3)).isFalse();
    }

    @Test
    void testNotInterval() {
        assertThat(newExempl.isInInterval(10)).isFalse();
    }

    @Test
    void testInInterval() {
        assertThat(newExempl.isInInterval(30)).isTrue();
    }


}

