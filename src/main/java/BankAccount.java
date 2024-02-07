import java.time.LocalDate;

public class BankAccount {

//    CLASS ATTRIBUTES
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

//    CONSTRUCTOR FUNCTION
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

//    GETTERS AND SETTERS
    public String getFirstName() {
        return this.firstName;
    }

}
