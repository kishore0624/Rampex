import java.util.*;

public class GroupWords {
    public static void main(String[] args) {

        String[] words = {"Java", "API", "Spring", "Collection", "Map", "Queue"};

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {

            int len = word.length();

            if (!map.containsKey(len)) {
                map.put(len, new ArrayList<>());
            }

            map.get(len).add(word);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}