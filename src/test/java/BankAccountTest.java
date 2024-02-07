import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        LocalDate dateOfBirth = LocalDate.of(1985, 1, 9);
        account = new BankAccount("John", "Doe", dateOfBirth, 12345);
    }

    @Test
    public void canGetFirstName() {
        // ARRANGE
        String expected = "John";
        // ACT
        String actual = account.getFirstName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }
}
