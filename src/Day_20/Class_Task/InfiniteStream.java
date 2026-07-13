package Day_20.Class_Task;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class InfiniteStream {
    public  static void main(String[] args) {
        Stream<String> s1 = Stream.of("rahul" , "keerthi" , "ram" , "sam");
        System.out.println(s1.map(n->n.length()).reduce(0,(a,b)->a>b?a:b));
        Stream<String> s2 = Stream.of("rahul" , "keerthi" , "ram" , "sam");
        System.out.println(s2.map(n->n.toUpperCase()).collect(Collectors.toList()));
    }
}
