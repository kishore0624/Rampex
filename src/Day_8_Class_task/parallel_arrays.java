package Day_8_Class_task;

import java.util.Scanner;

public class parallel_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] juice = {"maaza", "coke", "sprite", "mountain dew", "fizz"};
        int[] price = {35,30,30,35,40};
        String x = "done";
        int totalamt = 0;
        int amt = 0;
        System.out.println("maaza , coke , sprite , mountain dew , fizz ,exit");
        while (true) {
            System.out.println("Enter the juice name: ");
            String name = sc.nextLine();
            if (name.equals("exit")) {
                System.out.println("thank you");
                break;

            }


            System.out.println("Enter the quantity: ");
            int q = sc.nextInt();
            for (int i = 0; i < juice.length; i++) {
                if (name.equals(juice[i])) {

                    amt = q * price[i];
                    totalamt += amt;

                    //System.out.println("The amount : " + amt);

                    sc.nextLine();
                }


            }

        }
        System.out.println("total amount: " + totalamt);
    }
}