public class user
{
  accountdetails Account;
  private String Customername;
  private String Email;
  public user(accountdetails account, String customername, String email)
  {
    super();
    Account = account;
    setCustomername(customername);
    setEmail(email);
  }
  public String getCustomername() 
  {
    return Customername;
  }
  public void setCustomername(String customername) 
  {
    this.Customername = customername;
  }
  public String getEmail() 
  {
    return Email;
  }
  public void setEmail(String email) 
  {
    this.Email = email;
  }
  public boolean withdraw(accountdetails acc, double withdrawamount)
  {
    boolean v = false;
    double balanceremained;
    if(withdrawamount <= acc.getBalance())
    {
      balanceremained = acc.getBalance() - withdrawamount;
      acc.setBalance(balanceremained);
      System.out.println("Please take your money!");
      System.out.println("The balance Remained is:" + acc.getBalance());
      v = true;
    }
    else
    {
      System.out.println("The amount mentioned for withdrawal is more than the balance in the account.");
      v = false;
    }
    return v;
  }
  public void Deposit(accountdetails acc, double depositamount)
  {
    double afterbalance;
    afterbalance = acc.getBalance() + depositamount;
    acc.setBalance(afterbalance);
  }
}
