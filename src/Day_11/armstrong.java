package Day_11;

public class armstrong {
    public static void main(String[] args){


        System.out.println("the given amstorng number is " +checkams(153));


    }


    public static boolean checkams(int num){
        int temp=num;
        int org=num;
        int digit=0;
        while(temp!=0){
            temp= temp/10;
            digit++;
        }

        int sum = 0;
        int rem;

        while(num!=0){
            rem=num%10;
            sum=sum+(int)(Math.pow(rem,digit));
            num=num/10;

        }
        System.out.println("the amstrong is "+sum);

        if (org==sum){
            return true;
        }
        else {
            return false;
        }

    }
}