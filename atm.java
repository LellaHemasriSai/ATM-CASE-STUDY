import java.util.ArrayList;
public class atm {
    ArrayList<user> users = new ArrayList<user>();
    cash Dispenser;
    public atm(cash dispenser)
    {
        super();
        this.users = new ArrayList<user>();
        Dispenser = dispenser;
    }
    public boolean enter(int accountnumber, int pin, ArrayList<user> listOfcustomers){
		int AccountNumber;
		int AccountPin;
		boolean v = false;
		for(int i=0; i<listOfcustomers.size(); i++)
        {
			user u = listOfcustomers.get(i);
			accountdetails a = u.Account;
			AccountNumber = a.getAccnumber();
			AccountPin = a.getPin();
			if(AccountNumber == accountnumber && AccountPin == pin)
            {
				v = true;
			}
		}
		return v;
	}
}
