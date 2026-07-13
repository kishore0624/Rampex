package Day_7.home_task;

import java.util.Arrays;

public class rotate_array_elements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n=7;
        System.out.println("initial array: " + Arrays.toString(arr));
        for(int j=0;j<n;j++) {
            int first=arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println("After one rotation: " + Arrays.toString(arr));
    }
}