import java.time.LocalDate;

public class BankAccount {

//    CLASS ATTRIBUTES
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;

//    CONSTRUCTOR FUNCTION
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, String accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }

//    CUSTOM METHODS
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

    public void payInterest(double interestRate) {
        // interestRate is percentage
        this.balance *= (1 + interestRate/100);
    }


//    GETTERS AND SETTERS
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



}
