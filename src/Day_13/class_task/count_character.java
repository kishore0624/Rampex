package Day_13.class_task;
import java.util.Scanner;
public class count_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word to count: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }


            }

            System.out.println(s.charAt(i) + ":" + count);
        }

    }
}