import java.util.Arrays;
import java.util.stream.Collectors;

public class StartsWithA {
    public static void main(String[] args) {

        String[] names = {"Arun", "Bala", "Ajay", "Kiran", "Akash", "Vignesh"};

        System.out.println(
                Arrays.stream(names)
                        .filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList())
        );
    }
}