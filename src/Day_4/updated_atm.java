package Day_4;

import java.util.Scanner;

public class updated_atm {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int balance=10000;
        int pin=9999;
        System.out.print("Is card inserted? (1=Yes, 0=No): ");
        int inserted=sc.nextInt();
        if (inserted == 1)
        {
            System.out.print("Is card valid? (1=Yes, 0=No): ");
            int valid = sc.nextInt();
            if (valid == 1)
            {
                System.out.print("Enter password: ");
                int password = sc.nextInt();
                if (password == pin)
                {
                    System.out.print("Enter amount: ");
                    int amount = sc.nextInt();
                    if(amount>0)
                    {
                        if (amount <= balance)
                        {
                            System.out.println("amount disbursed");
                            balance = balance-amount;
                        }
                        else
                        {
                            System.out.println("insufficient balance");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid amount");
                    }
                }
                else
                {
                    System.out.println("password incorrect");
                }
            }
            else
            {
                System.out.println("card is invalid");
            }

        }
        else
        {
            System.out.println("card is not inserted");
        }
    }
}