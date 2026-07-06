package Day_2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter mark");
        int mark=scan.nextInt();
        if(mark<=100)
        {
            if(mark>90&&mark<=100)
            {
                System.out.println("grade A");
            }
            else if(mark>80&&mark<=90)
            {
                System.out.println("grade B");
            }
            else if(mark>64&&mark<=80)
            {
                System.out.println("grade C");
            }
            else
            {
                System.out.println("FAIL");
            }
        }
        else
        {
            System.out.println("invalid input");
        }

    }
}