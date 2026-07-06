package Day_7_class_task;

public class finding_min {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,4};
        int min = arr[0];

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum value in the array is : " + min);
    }
}