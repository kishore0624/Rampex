package Day_19.Home_task;
import java.util.ArrayList;
import java.util.Collections;

public class DuplicateInSentence {
    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<>();
        String str = "java is easy and java is powerful and java is popular";
        String[] word = str.split(" ");
        for (String words : word) {
            n.add(words);
        }
        ArrayList<String> arr1 = new ArrayList<>();
        for(String words:n){
            if( Collections.frequency(n,words) > 1 && !arr1.contains(words)){
                arr1.add(words);
            }
        }
        System.out.println(arr1);


    }
}