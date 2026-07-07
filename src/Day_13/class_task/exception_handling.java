package Day_13.class_task;

public class exception_handling {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        int x = a / (b + c);
        System.out.println(x);
        try {
            int y = a / (b - c);
            System.out.println("y: " + y);
        } catch (Exception e) {

        }
        System.out.println("program ended");
    }
}