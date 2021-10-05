package pratikshya.N;

class BankAccount{
    int customerId,accountId,balance;
    BankAccount(int customerId,int accountId,int balance)
    {
        this.customerId=customerId;
        this.accountId=accountId;
        this.balance=balance;
    }
    public double DepositAmount(double amount)
    {
        balance+=amount;
        return balance;
    }
     public double withdrawAmount(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            return balance;
        }
        else
            return -1;
    }
      public double AddInterest(double percent)
    {
        double interest=percent/100;
        balance+=balance*interest;
        return balance;
    }
}
public class BankAccountDemo {

	public static void main(String[] args) {
		 System.out.println("Creating the Account of a customer with 10000 balance and performing the opertaion");
		    BankAccount obj=new BankAccount(101,1234,10000);
		    System.out.println("Depositing 5000");
		    System.out.println("Now the Current balance is"+obj.DepositAmount(5000));
		    System.out.println("Withdrawing 2000 from the accout");
		    System.out.println("Now the Current balance is"+obj.withdrawAmount(2000));
		    System.out.println("Now with interest 5 % the current amount will be:"+obj.AddInterest(5));
		    
	}

}
