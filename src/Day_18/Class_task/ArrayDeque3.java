package Day_18.Class_task;
import java.util.ArrayDeque;
public class ArrayDeque3 {
    public static void main(String[] args) {
        String [] task ={"Download" , "Compile" , "test" , "Deploy"};
        ArrayDeque<String> dq = new ArrayDeque<String>();
        for(String i : task){
            dq.add(i);
        }
        for(String i : dq){
            System.out.print(i + "->");
        }
    }
}
