package Day_8_Home_task;

public class find_missing_numbers {
    public static void main(String[] args){

        int sum=0;
        int asum=0;
        int n=10;
        int []arr={1,2,3,4,5,6,7,8,10};
        for(int i=0;i<=n;i++){
            asum+=i;
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int missingnum=asum-sum;
        System.out.println("the missing number from 1 to "+n+": " + missingnum);

    }
}