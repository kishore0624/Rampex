package Day_7_class_task;

public class sum_of_odd_elements {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<=4;i++){
            if (i%2==0){
                sum = arr[i] + sum;
            }
        }
        System.out.println("sum:"+sum);
    }
}