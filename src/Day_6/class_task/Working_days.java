package Day_6.class_task;

public class Working_days {

    public static void main(String[] args) {

        int workingDays = 0;

        for (int month = 1; month <= 12; month++) {

            for (int week = 1; week <= 4; week++) {

                for (int day = 1; day <= 7; day++) {

                    if (day <= 5) {
                        workingDays++;
                    }

                }
            }
        }

        System.out.println("Total Working Days = " + workingDays);

    }
}