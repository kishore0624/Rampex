package Day_7_home_task;

public class number_of_odd_and_even_count {
    public static void main(String[] args) {
        int []arr={1,3,5,7,9,2,4,6,8,9};
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else if (arr[i] % 2 != 0) {
                oddcount++;
            }
        }
        System.out.println( "Even count: "+evencount);
        System.out.println("odd count: "+oddcount);

    }
}