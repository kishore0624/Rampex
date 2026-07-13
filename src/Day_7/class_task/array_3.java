package Day_7.class_task;

import java.util.Arrays;

public class array_3 {
    public static void main(String[]args){
        int []arr=new int[5];
        for(int i =0;i<5;i=i+2){
            arr[i]=(2*i)-1;
        }
        System.out.print(Arrays.toString(arr));
    }
}