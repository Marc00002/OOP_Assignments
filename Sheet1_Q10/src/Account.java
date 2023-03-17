import java.time.LocalDate;

public class Account {
    private int id;
    private double balance;
     static double annualInterestRate ;
    protected LocalDate DateCreated ;
    public Account(){}
    public Account( int id , double balance )
    {
        this.id = id;
        this.balance = balance;
        LocalDate myObj = LocalDate.now(); // Create a date object
        DateCreated=myObj;
        //System.out.println(myObj); // Display the current date
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        Account.annualInterestRate = annualInterestRate;
    }

    public static double getMonthlyInterestRate()
    {
        return (annualInterestRate/12);
    }
    public double getMonthlyInterest()
    {
        return (balance * getMonthlyInterestRate()/100);
    }
    public void Deposit(double x)
    {
        balance=balance + x;
    }
    public void Withdraw(double x)
    {
        balance=balance - x;
    }
}


