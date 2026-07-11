import java.util.*;

public class CountX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
            list.add(sc.nextInt());

        int x = sc.nextInt();

        System.out.println(Collections.frequency(list, x));
    }
}