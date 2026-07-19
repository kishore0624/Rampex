package Day_21.Home_task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");
        System.out.println(list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));

    }
}