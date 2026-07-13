package Day_20.Class_Task;
import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,10,1,2,3};
        Arrays.stream(arr).filter((n)-> n%2!=0).sorted().forEach(n -> System.out.println(n));

        ArrayList<Integer> s = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        s.add(3);
        System.out.println(s.stream().sorted());
        System.out.println(s.stream().sorted().collect(Collectors.toList()));
    }
}
