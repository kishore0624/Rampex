package Day_16.Home_task;
import java.util.ArrayList;
public class RemoveDupUsingNestedLoop {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5};
        ArrayList<Integer> n = new ArrayList<>();
        for(int i:arr){
            n.add(i);
        }
        for(int i=0;i<n.size();i++){
            for(int j=i+1;j<n.size();j++){
                if(n.get(i).equals(n.get(j))){
                    n.remove(j);
                    //j--;
                }
            }
        }
        System.out.println(n);
    }
}