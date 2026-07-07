package Day_8_Home_task;

import java.util.Arrays;

public class find_duplicates {
    public static void main(String[] args){
        int []arr={1,1,2,3,4,4,4,5,6,7,8,8,8,8,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}