// ATM Interface in Java

import java.util.Scanner;
public class Atm
{
    public static void main(String args[])
    {
        int balance = 50000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        int pin=1234;
        System.out.println("Please Enter PIN: ");
        int password=sc.nextInt();
        int i=1;
        if(password!=pin)
        {
            while(true)
            {
                i++;
                System.out.println("Wrong PIN!! ");
                System.out.println("Please Re-enter your PIN (Max. Attempts :- 3) : ");
                password=sc.nextInt();
                if(password==pin)
                {
                    break;
                }
                if(i==3){
                    //user will get only 3 max attempts to re-enter the pin number
                    System.out.println("You have exceeded your trials !!! Retry After some time....!");
                    System.exit(0);
                }
            }
        }
        if(password==pin)
        {
            System.out.println("*****Welcome To Bank Of Baroda ATM*****");
            while(true)
            {
                System.out.println("Enter 1 --> to Check Balance");
                System.out.println("Enter 2 --> to Withdraw Money");
                System.out.println("Enter 3 --> to Deposit Money");
                System.out.println("Enter 4 --> to QUIT");
                System.out.print("Choose one of the option: ");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("Your Account Balance is : "+balance);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to Withdraw : ");
                        withdraw=sc.nextInt();
                        //checking if balance is less than withdrawal amount or is it zero!
                        if(withdraw>balance||balance==0)
                        {
                            System.out.println("You have insufficient funds to withdraw!!\n");
                            break;
                        }
                        System.out.println("Hope you received your amount!");
                        balance=balance-withdraw;
                        System.out.println("");
                        break;
                    case 3:
                        System.out.print("Enter Money to be deposited: ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println(" ");
                        break;

                    case 4:
                        System.out.println("\n*****Thank you for using Bank Of Baroda ATM!*****");
                        System.exit(0);
                }
            }
        }
    }
}