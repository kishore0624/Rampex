package Day_7.class_task;

public class sum_of_even_numbers{
    public static void main(String[] args){
        int arr[] ={2,4,6,8,10};
        int sum=0;
        for (int i=0;i<=4;i++){
            if (i%2!=0){
                sum = arr[i] + sum;
            }
        }
        System.out.println("sum:"+sum);
    }
}