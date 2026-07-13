package Day_6.class_task;

public class third {

    public static void main(String[] args) {

        for (int month = 1; month <= 12; month++) {

            for (int week = 1; week <= 4; week++) {

                if (week == 3) {
                    break; // Stop current month
                }

                for (int day = 1; day <= 7; day++) {

                    System.out.println("Month " + month +
                            " Week " + week +
                            " Day " + day);
                }
            }
        }
    }
}