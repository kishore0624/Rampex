package Day_21.Home_task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");
        System.out.println(list.stream().max(Comparator.comparing(String::length)).orElse(null));
    }
}