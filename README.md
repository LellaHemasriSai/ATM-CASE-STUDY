# ATM-CASE-STUDY
A local bank intends to install a new automated teller machine(ATM) to allow users (i.e.,bank
customers) to perform basic financial transactions. Each user can have only one account at the
bank. ATM users should be able to view their account balance, withdraw cash(i.e., take money
out of an account ) and deposit funds(i.e.,place money into an account) etc.
The user interface of the automated teller machine contains the following hardware
components:


● a screen that displays messages to the user

● A keypad that receives numeric input from the user

● A cash dispenser that dispenses cash to the user and

● A deposit slot that receives deposit envelopes from the user.

The cash dispenser begins each day loaded with a certain amount. [Note: certain elements of
the ATM described here do not accurately mimic those of a real ATM. For example, a real ATM
typically contains a device that reads a user’s account number from an ATM card, whereas this
ATM asks the user to type an account number using the keypad. A real ATM also usually prints
a receipt at the end of a session, but all output from this ATM appears on the screen].
The bank wants you to develop software to perform the financial transactions initiated by bank
customers through the ATM. The bank will integrate the software with the ATM’s hardware at a
later time. The software should encapsulate the functionality of the hardware devices (e.g.,cash
dispenser, deposit slot) within software components ,but it need not concern itself with how
these devices perform their duties.The ATM hardware has not been developed yet,so instead of
writing your software to run on the ATM,you should develop a first version of the software to run
on a personal computer. This version should use the computer’s monitor to simulate the ATM’s
screen,and the computer’s key-board to simulate the ATM’s keypad.
We make the simplifying assumption that the bank trusts the ATM to access and manipulate the
information in the database without significant security measures.
Upon first approaching the ATM, the user should experience the following sequence of events
1. The screen displays a welcome message and prompts the user to enter an account
number.
2. The user enters a five-digit account number,using the keypad.
3. The screen prompts the user to enter the PIN associated with the specified account
number.
4. The user enters a five-digit PIN,using the keypad.
5. If the user enters a valid account number and the correct PIN for that account, the
screen displays the main menu. If the user enters an invalid account number or an
incorrect PIN, the screen displays an appropriate message,then theATM returns to Step
1 to restart the authentication process.
