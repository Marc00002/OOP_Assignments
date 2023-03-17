public class test {
    public static void main(String[] args)
    {
        Account x=new Account(1122,20000);
        x.setAnnualInterestRate(4.5);
        x.Withdraw(2500);
        x.Deposit(3000);
        System.out.println(x.getBalance()+"  "+ x.getMonthlyInterest()+ "  " +x.DateCreated );
    }
}