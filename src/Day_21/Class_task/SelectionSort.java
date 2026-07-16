package Day_21.Class_task;
import java.util.*;
public class SelectionSort {
    static void main(String[] args) {
        int [] arr = {10,4,7,6,9,2};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        int a = arr.length;
        int temp = 0;
        int minIndex;
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                if(arr[j]>arr[j+1]){
                    minIndex = j;
                    temp = arr[minIndex];
                    arr[minIndex] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
   }}

