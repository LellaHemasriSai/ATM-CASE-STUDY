import java.util.Scanner;

public class mainclass{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        accountdetails a1 = new accountdetails(12345, 67584, 123456789, 20000);
        accountdetails a2 = new accountdetails(67890, 29845, 987654321, 30000);
        accountdetails a3 = new accountdetails(13579, 40387, 234567891, 40000);

        user u1 = new user(a1, "Rahul", "rahul@gmail.com");
        user u2 = new user(a2, "Ravi", "ravi@gmail.com");
        user u3 = new user(a3, "Rohan", "rohan@gmail.com");

        cash c1 = new cash(5000000);
        atm atm1 = new atm(c1);
        otp o1 = new otp();
        atm1.users.add(u1);
        atm1.users.add(u2);
        atm1.users.add(u3);

        boolean open = true;
        while(open == true)
        {
            System.out.println("----------------WELCOME---------------------");
            int accnum = 0;
            System.out.println("Please enter your 5-digit account number.");
            accnum = input.nextInt();
            String a = String.valueOf(accnum);
            if(a.length() == 5)
            {
                int pin = 0;
                System.out.println("Please enter your 5-digit pin number.");
                pin = input.nextInt();
                String p = String.valueOf(pin);
                if(p.length() == 5)
                {
                    
                    boolean s = atm1.enter(accnum, pin, atm1.users);
                    
                    if(s == true)
                    {
                        user au = null;
                        for(int i=0; i<atm1.users.size();i++)
                        {
                            user u = atm1.users.get(i);
                            if(u.Account.getAccnumber() == accnum && u.Account.getPin() == pin)
                            {
                                au = atm1.users.get(i);
                            }
                        }
                        boolean exit = true;
                        if(exit==true)
                        {
                            System.out.println("Please choose an option \n balance inquiry-1\n withdrawal-2\n deposit-3\n change details-4\n exit-5");
                            int entry = 0;
                            entry = input.nextInt();
                            boolean w = true;
                            if(entry == 1)
                            { 
                                String o2 = o1.o();
                                System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                System.out.println("Please enter the OTP sent to you.");
                                input.nextLine();
                                String r1 = input.nextLine();
                                if(o2.equals(r1))
                                {
                                    au.Account.givebalance();
                                    exit = true;
                                }
                                else
                                {
                                    System.out.println("You have entered wrong otp.");
                                }
                                
                            }
                            else if(entry == 2)
                            {
                                String o2 = o1.o();
                                System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                System.out.println("Please enter the OTP sent to you.");
                                input.nextLine();
                                String r1 = input.nextLine();
                                if(o2.equals(r1))
                                {
                                    w = false;
                                    if(w == false)
                                    {
                                        System.out.println("Please select an option \n withdraw amount-1 \n cancel transaction-2");
                                        int entry1 = 0;
                                        entry1 = input.nextInt();
                                        double amounttowithdraw = 0;
                                        if(entry1 == 1)
                                        {
                                            System.out.println("Please enter the amount to be withdrawed.");
                                            amounttowithdraw = input.nextDouble();
                                            if(amounttowithdraw >= 0)
                                            {
                                                if(atm1.Dispenser.money(amounttowithdraw))
                                                {
                                                    w = au.withdraw(au.Account, amounttowithdraw);
                                                }
                                            }
                                            else 
                                            {
                                                System.out.println("Invalid Input!");
                                            }
                                        }
                                        else if(entry1 == 2)
                                        {
                                            System.out.println("Transaction Cancelled.");
                                            w = true;
                                        }
                                        else
                                        {
                                            System.out.println("Invalid input");
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("You have entered wrong OTP.");
                                }
                            }
                            else if(entry == 3)
                            {
                                String o2 = o1.o();
                                System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                System.out.println("Please enter the OTP sent to you.");
                                input.nextLine();
                                String r1 = input.nextLine();
                                if(o2.equals(r1))
                                {
                                    double amounttodeposit = 0;
                                    System.out.println("Please enter the amount to be deposited.");
                                    System.out.println("Please enter the number of 2000 rupee notes.");
                                    int tt = input.nextInt();
                                    System.out.println("Please enter the number of 500 rupee notes.");
                                    int fh = input.nextInt();
                                    System.out.println("Please enter the number of 200 rupee notes.");
                                    int th = input.nextInt();
                                    System.out.println("Please enter the number of 100 rupee notes.");
                                    int oh = input.nextInt();
                                    System.out.println("Please enter the number of 50 rupee notes.");
                                    int ff = input.nextInt();
                                    System.out.println("Please enter the number of 20 rupee notes.");
                                    int tw = input.nextInt();
                                    System.out.println("Please enter the number of 10 rupee notes.");
                                    int ten = input.nextInt();
                                    System.out.println("Please enter the number of 5 rupee coins.");
                                    int five = input.nextInt();
                                    System.out.println("Please enter the number of 2 rupee coins.");
                                    int two = input.nextInt();
                                    System.out.println("Please enter the number of 1 rupee coins.");
                                    int one = input.nextInt();
                                    if(tt < 0 || fh < 0 || th < 0 || oh < 0 || ff < 0 || tw < 0 || ten < 0 || five < 0 || two < 0 || one <0)
                                    {
                                        System.out.println("Invalid input!");
                                    }
                                    else 
                                    {
                                        amounttodeposit = tt*2000 + fh*500 + th*200 + oh*100 + ff*50 + tw*20 + ten*10 + five*5 + two*2 + one*1;
                                        if(amounttodeposit >= 0)
                                        {
                                            au.Deposit(au.Account, amounttodeposit);
                                            atm1.Dispenser.setBalance(atm1.Dispenser.getBalance() + amounttodeposit);
                                            System.out.println("The amount is deposited. The balance now is:" + au.Account.getBalance());
                                        }
                                        else 
                                        {
                                            System.out.println("Invalid entry!");
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("You have entered wrong OTP.");
                                }   
                            }
                            else if(entry == 4)
                            {
                                System.out.println("Which details you want to change? \n pin-1 \n phone number-2 \n name-3 \n email-4");
                                int x = input.nextInt();
                                if(x == 1)
                                {
                                    String o2 = o1.o();
                                    System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                    System.out.println("Please enter the OTP sent to you.");
                                    input.nextLine();
                                    String r1 = input.nextLine();
                                    if(o2.equals(r1))
                                    {
                                        System.out.println("Please enter your new pin number.");
                                        int n = input.nextInt();
                                        String nu = String.valueOf(n);
                                        if(nu.length() == 5)
                                        {
                                            au.Account.setPin(n);
                                            System.out.println("Your updated PIN number is: " + au.Account.getPin());
                                        }
                                        else 
                                        {
                                            System.out.println("Sorry! Your pin number should consist of 5 digits.");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You have entered wrong OTP.");
                                    } 
                                }
                                else if(x == 2)
                                {
                                    
                                    String o2 = o1.o();
                                    System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                    System.out.println("Please enter the OTP sent to you.");
                                    input.nextLine();
                                    String r1 = input.nextLine();
                                    if(o2.equals(r1))
                                    {
                                        System.out.println("Your phone number as per our records is: " + au.Account.getPhone());
                                        System.out.println("Do you want to change your phone number? \n yes-1 \n no-2");
                                        int y = input.nextInt();
                                        if(y == 1)
                                        {
                                            System.out.println("Please enter your new phone number.");
                                            int m = input.nextInt();
                                            String mu = String.valueOf(m);
                                            if(mu.length() == 5)
                                            {
                                                au.Account.setPhone(m);
                                                System.out.println("Your updated phone number is: " + au.Account.getPhone());
                                            }
                                            else 
                                            {
                                                System.out.println("Your phone number should consist of 10 digits.");
                                            }
                                        }
                                        else if(y == 2)
                                        {
                                            System.out.println("Your phone number as per our records is: " + au.Account.getPhone());
                                        }
                                        else 
                                        {
                                            System.out.println("Invalid Input!");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You have entered wrong OTP.");
                                    }
                                }
                                else if(x == 3)
                                {
                                    String o2 = o1.o();
                                    System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                    System.out.println("Please enter the OTP sent to you.");
                                    input.nextLine();
                                    String r1 = input.nextLine();
                                    if(o2.equals(r1))
                                    {
                                        System.out.println("Your name as per our record is: " + au.getCustomername());
                                        System.out.println("Do you want to change your name? \n yes-1 \n no-2");
                                        int y = input.nextInt();
                                        if(y == 1)
                                        {
                                            System.out.println("Please enter your new name.");
                                            input.nextLine();
                                            String n = input.nextLine();
                                            au.setCustomername(n);;
                                            System.out.println("Your updated name is: " + au.getCustomername());
                                        }
                                        else if(y == 2)
                                        {
                                            System.out.println("Your name as per our record is: " + au.getCustomername());
                                        }
                                        else 
                                        {
                                            System.out.println("Invalid Input!");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You have entered wrong OTP.");
                                    }
                                }
                                else if(x == 4)
                                {
                                    String o2 = o1.o();
                                    System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                    System.out.println("Please enter the OTP sent to you.");
                                    input.nextLine();
                                    String r1 = input.nextLine();
                                    if(o2.equals(r1))
                                    {
                                        System.out.println("Your email as per our record is: " + au.getEmail());
                                        System.out.println("Do you want to change your email? \n yes-1 \n no-2");
                                        int y = input.nextInt();
                                        if(y == 1)
                                        {
                                            System.out.println("Please enter your new email-ID.");
                                            String n = input.nextLine();
                                            au.setEmail(n);;
                                            System.out.println("Your updated email-ID is: " + au.getEmail());
                                        }
                                        else if(y == 2)
                                        {
                                            System.out.println("Your email-ID as per our record is: " + au.getEmail());
                                        }
                                        else 
                                        {
                                            System.out.println("Invalid Input!");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You have entered wrong OTP.");
                                    }
                                }
                                else 
                                {
                                    System.out.println("Invalid Input!");
                                }
                            }
                            else if(entry == 5)
                            {
                                String o2 = o1.o();
                                System.out.println("Your OTP is sent to you: " + o2 + " It is valid for 60 sec.");
                                System.out.println("Please enter the OTP sent to you.");
                                input.nextLine();
                                String r1 = input.nextLine();
                                if(o2.equals(r1))
                                {
                                    s = false;
                                    exit = false;
                                    System.out.println("Thank you! Visit again!");
                                }
                                else 
                                {
                                    System.out.println("Invalid Input!");
                                }
                            }
                            else 
                            {
                                System.out.println("Invalid entry!");
                            }
                        }
                        
                    }
                    else 
                    {
                        System.out.println("Please enter correct details! They are not matching with our records.");
                    }
                }
                else 
                {
                    System.out.println("Please enter a valid pin number! It should contain 5 digits.");
                }
            }
            else 
            {
                System.out.println("Please enter a valid account number! It should contain 5 digits.");
            }
        }
        input.close();
    }   
}
