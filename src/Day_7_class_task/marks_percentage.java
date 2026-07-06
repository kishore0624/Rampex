package Day_7_class_task;

import java.util.Arrays;
import java.util.Scanner;

public class marks_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        String[] subject = new String[5];
        int total = 0;
        System.out.println("Enter the canditate name:");
        String name = sc.nextLine();

        for(int i = 0; i < marks.length; ++i) {
            System.out.println("Enter the subject name :");
            subject[i] = sc.nextLine();
            System.out.println("Enter the marks " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            sc.nextLine();
            total += marks[i];
        }

        float percentage = (float)(total / marks.length);
        System.out.println(name + " you have scored a total of " + total + " with the percentage of " + percentage + "%");
        System.out.println(Arrays.toString(marks));
    }
}