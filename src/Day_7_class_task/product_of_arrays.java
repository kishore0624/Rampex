package Day_7_class_task;

import java.util.Arrays;
import java.util.Scanner;

public class product_of_arrays {
    public static void main(String[] args) {
        new Scanner(System.in);
        int product = 1;
        int[] arr = new int[]{2,3,4,5,6};

        for(int i = 0; i <= 4; ++i) {
            product *= arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(product);
    }
}