package Day_4;

import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int factorcount =0;
        if(number ==1 || number ==0)
        {
            System.out.println("neither prime nor composite");
        }
        else
        {
            for(int i=1;i<=number;i++)
            {
                if (number%i==0)
                {
                    factorcount+=1;
                }
            }
            if(factorcount == 2)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("composite");
            }
        }
    }
}