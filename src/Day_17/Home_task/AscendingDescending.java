import java.util.*;

public class AscendingDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<n;i++)
            list.add(sc.next());

        Collections.sort(list);
        System.out.println("Ascending : " + list);

        Collections.reverse(list);
        System.out.println("Descending : " + list);
    }
}