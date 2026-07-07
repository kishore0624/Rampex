package Day_13.class_task;
import java.util.Scanner;
public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check : ");
        String a = sc.nextLine();
        a = a.toLowerCase();
        System.out.println(isanagram(a));
    }

    public static boolean isanagram(String a) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < a.length(); i++) {
            if (!a.contains(arr[i])) {
                return false;
            }
            return true;
        }


        return false;
    }
}

//  System.out.println("Anagram ");

//  return false;