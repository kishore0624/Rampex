package Day6.class_Task;

public class Second_Saturday {

    public static void main(String[] args) {

        for (int month = 1; month <= 12; month++) {

            for (int week = 1; week <= 4; week++) {

                for (int day = 1; day <= 7; day++) {

                    if (week == 2 && day == 6) {
                        System.out.println("Month " + month +
                                " Week " + week +
                                " Day " + day + " (Second Saturday)");
                    }

                }
            }
        }

    }
}