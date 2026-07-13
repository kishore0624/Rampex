package Day_7.class_task;

public class finding_max_and_second_max {
    public static void main(String[] args) {
        int[] arr = new int[]{400,959,98,999,344};
        int max = 0;
        int Secondmax = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                Secondmax = max;
                max = arr[i];
            }
        }

        System.out.println("MAX: " + max);
        System.out.println("SMAX: " + Secondmax);
    }
}