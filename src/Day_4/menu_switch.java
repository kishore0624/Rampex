package Day_4;

import java.util.Scanner;

public class menu_switch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n--- RESTAURANT MENU ---");
            System.out.println("1 ---> Veg");
            System.out.println("2 ---> Non-Veg");
            System.out.println("3 ---> Desserts");
            System.out.println("4 ---> Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("veg meals , veg biriyani , veg rice, lemon rice , curd rice");
                    break;
                case 2:
                    System.out.println("chicken rice, chicken biriyani , mutton biriyani ,egg rice,non veg meals,mutton chukka, chicken 25,lollipop");
                    break;
                case 3:
                    System.out.println("Gulab Jamun, Ice Cream");
                    break;
                case 4:
                    System.out.println("Thank you for visiting! Goodbye.");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please enter a number between 1 and 4.");
                    break;
            }


        }
    }
}