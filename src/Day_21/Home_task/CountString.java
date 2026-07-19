package Day_21.Home_task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Apple", "Banana", "Ant", "Cat", "Aeroplane");
        System.out.println(list.stream().filter(n->n.startsWith("A")).count());


    }
}