package Day_21.Home_task;

public class PrintN {
    public static void main(String[] arg){
        int num=5;
        print(num);
    }
    public static void print(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        num--;
        print(num);
    }
}