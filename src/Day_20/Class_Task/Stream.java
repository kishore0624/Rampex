package Day_20.Class_Task;
import java.util.*;
public class Stream<S> {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,10,1,2,3};
        Arrays.stream(arr).filter((n)-> n%2!=0).sorted().forEach(n -> System.out.println(n));
    }
}
