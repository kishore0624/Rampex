package Day_18.Class_task;
import java.util.ArrayDeque;
public class ArrayDeque3 {
    public static void main(String[] args) {
        String[] task = {"Download", "Compile", "test", "Deploy"};
        ArrayDeque<String> dq = new ArrayDeque<>();
        for (String i : task) {
            dq.add(i);
        }
        int count = 0;
        int size = dq.size();
        for (String i : dq) {
            count++;
            if (count == size) {
                System.out.print(i);
            } else {
                System.out.print(i + "->");
            }
        }
    }
}