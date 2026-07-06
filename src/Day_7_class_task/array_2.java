package Day_7_class_task;

import java.util.Arrays;
import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("enter the value:");
            arr[i] = sc.nextInt();
            System.out.print(Arrays.toString(arr));
        }

    }
}