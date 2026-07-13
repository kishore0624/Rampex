package Day_8.Class_task;

import java.util.Scanner;

public class vowels_and_consonants {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word:");
        String  name=sc.nextLine();
        int vowels=0;
        int consonants = 0;
        for(int i=0;i<name.length();i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A' || name.charAt(i) == 'e' || name.charAt(i) == 'E' || name.charAt(i) == 'i'
                    || name.charAt(i) == 'I' || name.charAt(i) == 'o' || name.charAt(i) == 'O' || name.charAt(i) == 'u' || name.charAt(i) == 'U') {
                vowels++;
                consonants = name.length()-vowels;

            }
        }
        System.out.println("vowels count:"+ vowels);
        System.out.println("consonants count:"+ consonants);
    }
}