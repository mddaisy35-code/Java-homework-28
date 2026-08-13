public class ATM {

public static void main(String[] args) {

  double balance = 10000;
  double withdrawAmount = 15000;

  try {

        System.out.println("Account Balance: " + balance);
        System.out.println("Withdraw Amount: " + withdrawAmount);

if (withdrawAmount > balance) {
         throw new ArithmeticException("Insufficient Balance");
 }

          balance = balance - withdrawAmount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);

  } 
     catch (ArithmeticException e) {

         System.out.println("Exception: " + e.getMessage());

 } 
        finally {

         System.out.println("ATM Transaction Completed");

        }
    }
}