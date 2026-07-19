package Day_21.Home_task;

import java.util.Arrays;
import java.util.List;

public class SumofAllEven{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list.stream().filter(n->n%2==0)
                .mapToInt(Integer::intValue)
                .sum());
    }
}