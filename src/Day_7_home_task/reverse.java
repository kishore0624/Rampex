package Day_7_home_task;


import java.util.Arrays;
import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");

        for(int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The original array : " + Arrays.toString(arr));
        System.out.println("The reversed array : ");

        for(int i = size - 1; i >= 0; --i) {
            if (i == size - 1) {
                System.out.print("[" + arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }

        System.out.print("]");
    }
}