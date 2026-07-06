package Day_1.home_task;

public class upper_lower {
    public static void main(String[] args) {
        char letter = '5';
        int value = letter;
        if (value >= 65 && value <= 90) {
            System.out.println(letter + " is upper");
        }
        else if (value >= 97 && value <= 122) {
            System.out.println(letter + " is lower");
        }
        else if (value >= 48 && value <= 57) {
            System.out.println(letter + " is number");
        }
        else {
            System.out.println(letter + " is sp ch");
        }
    }
}