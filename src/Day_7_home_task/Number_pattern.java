package Day_7_home_task;

import java.util.Scanner;

public class Number_pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i= n-1;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}