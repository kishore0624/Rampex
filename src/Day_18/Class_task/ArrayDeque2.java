package Day_18.Class_task;
import java.util.ArrayDeque;
public class ArrayDeque2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(5);
        dq.add(7);
        dq.add(9);
        String name = "kishore";
        String name1 = "kishore";
        String name2 = new String(  "kishore");
        String name3 = new String("kishore");
        System.out.println(System.identityHashCode(name2));
        System.out.println(System.identityHashCode(name3));
    }
}
