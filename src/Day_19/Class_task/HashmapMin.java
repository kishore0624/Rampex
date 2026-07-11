package Day_19.Class_task;
import java.util.HashMap;
import java.util.Map;

public class HashmapMin {
     public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<String , Integer>();
        hm.put("Sam" , 80);
        hm.put("Ram" , 90);
        hm.put("Ravi" , 75);
        hm.put("Rani" , 65);
        int min = Integer.MAX_VALUE;
        String name = " ";
        for(Map.Entry<String , Integer> e : hm.entrySet()){
            if(e.getValue()<min){
                name=e.getKey();
                min =  e.getValue();
            }
        }
        System.out.println(min);
        System.out.println(name);
    }
}
