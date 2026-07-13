package Day_6.class_task;

public class stopjune {

    public static void main(String[] args) {

        for (int month = 1; month <= 12; month++) {

            for (int week = 1; week <= 4; week++) {

                for (int day = 1; day <= 7; day++) {

                    System.out.println("Month " + month +
                            " Week " + week +
                            " Day " + day);
                }
            }

            if (month == 6) {
                break; // Stop after June is completed
            }
        }
    }
}