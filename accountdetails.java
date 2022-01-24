public class accountdetails {
    private int Accnumber;
    private int Pin;
    private int Phone;
    private double Balance;
    public accountdetails(int accnumber,int pin, int phone, double balance)
    {
        Accnumber = accnumber;
        Pin = pin;
        Phone = phone;
        Balance = balance;
    }
    public int getAccnumber(){
        return Accnumber;
    }
    public void setAccnumber(int accnumber)
    {
        this.Accnumber = accnumber;
    }
    public int getPin(){
        return Pin;
    }
    public void setPin(int pin)
    {
        this.Pin = pin;
    }
    public int getPhone(){
        return Phone;
    }
    public void setPhone(int Phone)
    {
        this.Phone = Phone;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double balance)
    {
        this.Balance = balance;
    }
    public void givebalance()
    {
        System.out.println("The Balance in the account is:" + getBalance());
    }
}
