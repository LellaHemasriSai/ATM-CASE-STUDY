public class cash
{
  private double Balance;
  public double getBalance()
  {
    return Balance;
  }
  public void setBalance(double balance)
  {
    Balance = balance;
  }
  public cash(double balance)
  {
    super();
    Balance = balance;
  }
  public boolean money(double amounttobegiven)
  {
    boolean v=false;
    if(amounttobegiven <= getBalance())
    {
      setBalance(getBalance()-amounttobegiven);
      v=true;
    }
    else
    {
      System.out.println("There is a smaller amonut in the ATM, Please choose a smaller amount");
      v=false;
    }
    return v;
  }
}
