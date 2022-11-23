import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){

        ATMOperation op = new AtmOperations();
        int ATM_Numner = 12345;
        int ATM_PIN = 123;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Enter ATM Number: ");
        int AtmNo = s.nextInt();
        System.out.println("Enter ATM PIN: ");
        int AtmPin = s.nextInt();

        if((ATM_Numner == AtmNo) && (ATM_PIN == AtmPin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice: ");

                int c = s.nextInt();
                if(c == 1){
                    op.viewBalance();
                }
                else if(c == 2){
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = s.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(c == 3){
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmount = s.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(c == 4){
                    op.viewMiniStatement();
                }
                else if(c == 5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM Number or PIN");
            System.exit(0);
        }
    }
}
