package Day_7.home_task;

import java.util.Arrays;

public class modify_class {
    public static void main(String[] args) {
        int[] arr = new int[]{122, -23, 22, -98, -70};

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}