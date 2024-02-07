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

    @Test
    public void canSetFirstName() {
        // ARRANGE
        String expected = "James";
        // ACT
        account.setFirstName("James");
        String actual = account.getFirstName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetLastName() {
        // ARRANGE
        String expected = "Doe";
        // ACT
        String actual = account.getLastName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName() {
        // ARRANGE
        String expected = "Smith";
        // ACT
        account.setLastName("Smith");
        String actual = account.getLastName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetDateOfBirth() {
        // ARRANGE
        LocalDate expected = LocalDate.of(1985, 1, 9);
        // ACT
        LocalDate actual = account.getDateOfBirth();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth() {
        // ARRANGE
        LocalDate expected = LocalDate.of(1986, 1, 9);
        // ACT
        account.setDateOfBirth(LocalDate.of(1986, 1, 9));
        LocalDate actual = account.getDateOfBirth();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber() {
        // ARRANGE
        int expected = 12345;
        // ACT
        int actual = account.getAccountNumber();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber() {
        // ARRANGE
        int expected = 54321;
        // ACT
        account.setAccountNumber(54321);
        int actual = account.getAccountNumber();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetBalance() {
        // ARRANGE
        double expected = 0;
        // ACT
        double actual = account.getBalance();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance() {
        // ARRANGE
        double expected = 99.99;
        // ACT
        account.setBalance(99.99);
        double actual = account.getBalance();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canDepositIntoAccount() {
        // ARRANGE
        double expected = 99.99;
        // ACT
        account.deposit(99.99);
        double actual = account.getBalance();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canWithdrawFromAccount() {
        // ARRANGE
        double expected = -10;
        // ACT
        account.withdraw(10);
        double actual = account.getBalance();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }



}
