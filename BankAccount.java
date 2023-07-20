package replit;
public class BankAccount{
  private double balance;

  public BankAccount(){
    balance =0;
  }
  public double getBalance(){
    return balance;
  }
  public void deposit(double amountIn){
    balance += amountIn;
  }
  
  public boolean withdraw(double amountIn){
    if (amountIn> balance){
      return false;
    }else {
      balance -= amountIn;
      return true;
    }
  }
}