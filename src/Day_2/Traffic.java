package Day_2;

import java.util.Scanner;

public class Traffic {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter signal");
        String colour = sc.nextLine();
        if(colour.equals("green")||colour.equals("GREEN"))
            System.out.print("go");
        else if(colour.equals("yellow")||colour.equals("YELLOW"))
            System.out.print("wait");
        else if(colour.equals("red")||colour.equals("RED"))
            System.out.print("stop");
        else{
            System.out.print("INVALID SIGNAL");}

    }

}