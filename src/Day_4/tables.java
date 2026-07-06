package Day_4;

import java.util.Scanner;

public class tables {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int number = sc.nextInt();
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        System.out.println("Multiplication Table ");
        for (int i = 1; i <= range; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}