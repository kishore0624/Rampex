package Day_1.home_task;
import java.util.Scanner;
import java.util.*;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int rev = 0;
        while(num!=0){
            int r=num%10;
            rev=rev*10 + r;
            num=num/10;
        }
        System.out.println("Reversed Number :" + rev);
    }
}
