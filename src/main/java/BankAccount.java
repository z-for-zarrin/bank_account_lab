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

    public void payInterest() {
        double interestRate = 0;
        if(this.accountType.equals("Current")) {
            interestRate = 0.02;
        }
        else if(this.accountType.equals("Savings")) {
            interestRate = 0.06;
        }
        else {
            System.out.println("Invalid account type");
        }

        this.balance *= (1 + interestRate);
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
