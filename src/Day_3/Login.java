package Day_3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("welcome ");
        System.out.print("enter your username: ");
        String username = sc.nextLine();
        System.out.print("enter password: ");
        String password = sc.nextLine();
        if (username.equals("sandy@123"))
        {
            if (password.equals("123"))
            {
                System.out.println("login success");
            }
            else
            {
                System.out.println("invalid password");
            }
        }
        else
        {
            System.out.println("invalid username");
        }


    }
}