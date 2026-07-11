import java.util.*;

public class SwapTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
            list.add(sc.nextInt());

        int i = sc.nextInt();
        int j = sc.nextInt();

        Collections.swap(list, i, j);

        System.out.println(list);
    }
}