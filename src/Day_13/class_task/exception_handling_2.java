package Day_13.class_task;

import java.util.Scanner;

public class exception_handling_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        try{
            int a = sc.nextInt();
            System.out.println(a*a);
        }
        catch(Exception a){

        }
        System.out.println("Program ended ");

    }
}