package Day_7_home_task;

public class sum_of_digits {

    public static void main(String[] args) {
        int n = 543;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println("sum: " + sum);
    }

}